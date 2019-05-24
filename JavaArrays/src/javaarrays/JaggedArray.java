/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][];
    int i,j,s,t,b=0;
    for(i=0;i<4;i++)
    {System.out.print("Enter the number of slow learners in Batch  "+i+" ");
    s=sc.nextInt();
    int n2=s/4;
    if(s%4!=0)
        n2++;
    a[i]=new int[n2];
    j=0;
    while(s>4)
        {
            a[i][j]=4;
            s=s-4;
            j++;
            
    }
    if(s!=0)
        a[i][j]=s;
    
    
    }
    for(i=0;i<4;i++)
    {System.out.println("Batch "+(i+1));
    System.out.println("Number of tutors "+(a[i].length));
        for(j=0;j<a[i].length;j++)
        {System.out.print(a[i][j]+" ");
        if(a[i][j]==4)
            b++;
        }
        System.out.println();
        
    }
    System.out.println("Number of batches with exactly 4 tutors "+b);
    
    }
    
    
}
