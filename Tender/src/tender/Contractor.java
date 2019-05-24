/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tender;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Contractor extends PWD implements tender_interface, Serializable{
    
    String cname;
    int yrsofexp;
    int numprojects;
    int id;
    double bid;
    int totalvalue;
    int delay;
    public void store_details()
    {   
        Scanner sc=new Scanner(System.in);
        if(this.cname.length()==0)
        {
        System.out.print("Enter name of the contractor : ");
        cname=sc.next();}
        System.out.print("Enter contractor ID : ");
        id=sc.nextInt();
        System.out.print("Enter years of experience : ");
        yrsofexp=sc.nextInt();
        System.out.print("Enter number of projects completed : ");
        numprojects=sc.nextInt();
        System.out.print("Enter total value of the completed projects : ");
        totalvalue=sc.nextInt();
        System.out.print("Enter total delay : ");
        delay=sc.nextInt();
        System.out.print("Enter your bid for the tender : ");
        bid=sc.nextDouble();
        System.out.println("**********************************");
        
    }
    public void GetFromFile()
    {
        String file="C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\contractors.txt";
        FileInputStream fi;
        ObjectInputStream oi;
        System.out.println("******FILE CONTENT*******");
        try
        {
        fi=new FileInputStream(file);
        oi=new ObjectInputStream(fi);
        ArrayList<Contractor> cc=null;
        cc=(ArrayList<Contractor>)oi.readObject();
        Iterator it=cc.iterator();
        while(it.hasNext())
        {
        Contractor element=(Contractor)it.next();
            
            System.out.println("Name : " +element.cname);
            System.out.println("ID : "+element.id);
            System.out.println("Years of experience : " +element.yrsofexp);
            System.out.println("Bid : "+element.bid);
            System.out.println("Number of projects completed : "+element.numprojects);
            System.out.println("Total value : "+element.totalvalue);
            System.out.println("Total delay : "+element.delay);
            System.out.println("\n*************************************\n");
            
        }
        fi.close();
        oi.close();
        
        
        }
        catch(FileNotFoundException e)
        {}
        catch(IOException e)
        {}
        catch(ClassNotFoundException e)
        {}
        
        
        
    }
    
    public void StoreToFile(ArrayList<Contractor>a)
    {
        String file="C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\contractors.txt";
        FileOutputStream fo;
        ObjectOutputStream oo;
        try
        {
        fo=new FileOutputStream(file);
        oo=new ObjectOutputStream(fo);
        oo.writeObject(a);
        oo.close();
        fo.close();
        }
        catch(FileNotFoundException e)
        {}
        catch(IOException e)
        {}
        
    }
    
}
