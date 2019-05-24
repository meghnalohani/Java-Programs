
package donors;


import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;


public class Donors implements Serializable{
    
    String name,add;
    String contact;
    int age;
    String bg;
    //Date ldate;
    String ldate;
    static String file="C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\donors.txt";
    public void getInfo(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details for the Donor "+(n+1)+" \n");
        System.out.print("Enter your name : ");name=sc.nextLine();
        System.out.print("Enter your age : ");age=sc.nextInt();
        System.out.print("Enter your contact number : ");contact=sc.next();
        System.out.print("Enter your address : ");add=sc.next();
        System.out.print("Enter your Blood group : ");bg=sc.next();
        System.out.print("Enter the last date of donation in dd/MM/yyyy format : ");ldate=sc.next();
        System.out.println("----------------------------------------------------");
    }
    public void searilizeDonors(ArrayList<Donors> donors) {
    try {
        FileOutputStream fileOut = new FileOutputStream(file,true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(donors);
        out.close();
        fileOut.close();
    } catch (IOException ex) {
    }
}
public void deserializeDonors() {
    List<Donors> donor_list = null;
    try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        donor_list = (List<Donors>)in.readObject(); 
        in.close();
    }
    catch(Exception e) {}
    Donors oo;
    int c=0;
    
    for (int i=0;i<donor_list.size();i++)
        {
            oo=donor_list.get(i);
            String bloodgrp=oo.bg;
            if(bloodgrp.equalsIgnoreCase("a+"))
            {
                String ldate2=oo.ldate;
                //difference should be more than 6 months 
                int m=Integer.parseInt(ldate2.substring(ldate2.indexOf("/")+1,ldate2.lastIndexOf("/")));
                int y=Integer.parseInt(ldate2.substring(ldate2.lastIndexOf("/")+1));
                int mm=(2019-y)*12+(3-m);
                if(mm>6)
                {   c++;
                    System.out.println("Name : "+oo.name);
                    System.out.println("Age : "+oo.age);
                    System.out.println("Address : "+oo.add);
                    System.out.println("Blood Group : "+oo.bg);
                    System.out.println("Contact : "+oo.contact);
                    System.out.println("Last donated : "+oo.ldate);
                    System.out.println("Last donated "+mm+" months ago");
                    System.out.println("-----------------------------------");
                }
                }
            oo=null;
        }
        if(c==0)
            System.out.println("None");
}
}

    
