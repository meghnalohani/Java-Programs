
package tender;
import java.util.Scanner;

public class Tender {

    String tname;
    String type;
    double budget;
    String place;
    int timeline;
    
    
    public Tender(String n,String t, double b,String p,int ti)
    {
        tname=n;
        type=t;
        budget=b;
        place=p;
        timeline=ti;
    }
    public void display_tender()
    {
        System.out.println("Name : "+tname);
        System.out.println("Type : "+type);
        System.out.println("Budget : "+budget);
        System.out.println("Location : "+place);
        System.out.println("Time : "+timeline);
        
    }
    
    
}
