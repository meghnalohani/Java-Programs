/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.util.Scanner;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,pos=-1;
    for(i=0;i<n;i++)
    {System.out.print("Enter number : ");
    a[i]=sc.nextInt();}
    System.out.print("Enter number to be deleted : ");
    int d=sc.nextInt();
    for(i=0;i<n;i++)
    {if(a[i]==d)
    { pos=i;
    break;}
    }
    if(pos==-1)
        System.out.println("Number not present in the array ");
    else
    {for(i=pos;i<n-1;i++)
        a[i]=a[i+1];
    System.out.println("Array after deletion : ");
    for(i=0;i<n-1;i++)
        System.out.print(a[i]+" ");
    }
   
    }
   }
