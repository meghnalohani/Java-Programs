/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.util.Scanner;

public class JavaArrays {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
                
                int n=sc.nextInt();
                int i,s=0;
                int a[]=new int[n];
                for(i=0;i<n;i++)
                {System.out.print("Enter number : ");
                    a[i]=sc.nextInt();
                    s=s+a[i];
                    
                }
                System.out.println("Sum = "+s);
                System.out.println("Average = "+(s/n));
        
    }
    
}
