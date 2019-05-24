/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.util.Scanner;


public class Pattern {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of i : ");
        int n=sc.nextInt();
        int c=0,i,j;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {for(j=0;j<=i;j++)
            {a[i][j]=c++;
            }}
    for(i=0;i<n;i++)
        {for(j=0;j<=i;j++)
            {System.out.print(a[i][j]+" ");
            }
        System.out.println();}
    }
    
}
