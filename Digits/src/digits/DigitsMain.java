package digits;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author eg1
 */
public class DigitsMain {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        System.out.println("-------------------------------------------------------");
        ArrayList <Integer> D=new ArrayList<Integer>();
        //Digits d=new Digits();
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
        int num=Integer.parseInt(sc.next());
        System.out.println("Number is "+num);
        Digits d1=new Digits(num);
        int l=d1.count(num);
        if(l>m)
            System.out.println("Number of digits cannot be greater than "+m);
        else
        {
        Digits d2=new Digits(num,l);
        int l2=d2.count(m);
        d2.findFreq();
        D.add(d2.value);
        
      }
        System.out.println("---------------------------------------------------");
        
        }
        System.out.println("Ordering of Numbers");
        Collections.sort(D);
        Iterator it=D.iterator();
        while(it.hasNext()) {
         Object element = it.next();
         System.out.print(element + " ");
    }
}
}

