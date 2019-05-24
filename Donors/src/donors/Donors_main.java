
package donors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Donors_main {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*****WELCOME TO BLOOD DONATION APPLICATION*******\n");
        System.out.println("Enter the number of donors");
        int n=sc.nextInt();
        System.out.println();
        Donors donorlist[]=new Donors[n];
        ArrayList<Donors> donors_d=new ArrayList<Donors>();
        for(int i=0;i<n;i++)
        {
            donorlist[i]=new Donors();
            donorlist[i].getInfo(i);
            donors_d.add(donorlist[i]);
        }
        //serialize into file
        Donors o=new Donors();
        Donors oo=null;
        o.searilizeDonors(donors_d);
        //deserialize from file 
        
        System.out.println("\n*******VALID DONORS*********\n");
        System.out.println("------------------------------------");
        
        o.deserializeDonors();
        
    }
}
