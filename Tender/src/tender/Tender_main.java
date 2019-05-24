
package tender;
import java.util.Scanner;
import java.util.ArrayList;
public class Tender_main {
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        Tender td=new Tender("Welcome homes","Housing Unit",100000,"Chennai",36);
        
        System.out.println("********TENDER CREATED BY THE PWD*********");
        td.display_tender();
        System.out.println("*******************************************\n");
        
       
        System.out.println("Creating objects of Lnt, TATA and Reliance.....\n");
        LnT l=new LnT();
        System.out.println("Enter vendor details for LnT");
        l.store_details();
        Tata t=new Tata();
        System.out.println("Enter vendor details for TATA");
        t.store_details();
        Reliance r=new Reliance();
        System.out.println("Enter vendor details for Reliance");
        r.store_details();
        ArrayList<Contractor>list=new ArrayList();
        list.add(l);
        list.add(t);
        list.add(r);
        System.out.println("Objects created\n");
        System.out.println("Storing the vendor details in file........\n");
        Contractor c=new Contractor();
        c.StoreToFile(list);
        System.out.println("Details stored to file\n");
        System.out.println("Getting vendor details from file.........\n");
        c.GetFromFile();
        System.out.println("Details fetches\n");
        System.out.println("Computing ranks............");
        c.calculate_rank(l,t,r);
        
        
           
        
    }
    
    
        
           
        
    }
