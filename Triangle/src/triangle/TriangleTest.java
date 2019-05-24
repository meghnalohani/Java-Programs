
package triangle;
import java.util.Scanner;

public class TriangleTest {
    
    public static void computeRadius(Triangle t)
    {
        int a,b,c;
        a=t.getSide1();
        b=t.getSide2();
        c=t.getSide3();
        double s=(a+b+c)/2;
        boolean flag=true;
        boolean c1=true,c2=true,c3=true;
       try
       {
        if(a==0 || b==0 || c==0)
        {   
            throw new SideIsZero("SideIsZeroException");
        }
        
        
        
        if ((a+b<=c)||(c+a<=b)||(c+b<=a))
        
        {
            throw new InvalidSides("InvalidSidesException");
        }  
       }
       catch(SideIsZero obj)
       {
           System.out.println("SideIsZero exception caught");
           flag=false;
       }
       catch(InvalidSides obj)
       {
           System.out.println("Invalid sides exception caught");
           flag=false;
       }

           
       
        
         
        
        double p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double r=p/(2*3.14);
        if(flag)
        System.out.println("Radius : "+r);
        else
            System.out.println("Radius not possible to calculate");
        
        
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle");
        System.out.print("First side : ");
        int s1=sc.nextInt();
        System.out.print("Second side : ");
        int s2=sc.nextInt();
        System.out.print("Third side : ");
        int s3=sc.nextInt();
        Triangle tr=new Triangle(s1,s2,s3);
        computeRadius(tr);
        
    }
}
