/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of numeric array : ");
    int n1=sc.nextInt();
    int i;
    int a1[]=new int[n1];
    for(i=0;i<n1;i++)
    {System.out.print("Enter number : ");
            a1[i]=sc.nextInt();
    }
    
    
    System.out.print("Enter the size of string array : ");
    int n2=sc.nextInt();
    String a2[]=new String[n2];
    for(i=0;i<n2;i++)
    {System.out.print("Enter string : ");
            a2[i]=sc.next();
    }
    System.out.println("-----NUMERIC ARRAY------");
    System.out.println("Unsorted Array : ");
    for(i=0;i<n1;i++)
        System.out.print(a1[i]+" ");
    System.out.println();
    Arrays.sort(a1);
    System.out.println("Sorted Array : ");
    for(i=0;i<n1;i++)
        System.out.print(a1[i]+" ");
    System.out.println();
    System.out.println("-----STRING ARRAY-----");
    System.out.println("Unsorted Array : ");
    for(i=0;i<n2;i++)
        System.out.print(a2[i]+" ");
    System.out.println();
    Arrays.sort(a2);
    System.out.println("Sorted Array : ");
    for(i=0;i<n2;i++)
        System.out.print(a2[i]+" ");
    System.out.println();
    
    
    
    }
    
    
}
