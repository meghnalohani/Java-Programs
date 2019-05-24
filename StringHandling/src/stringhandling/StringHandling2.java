/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;
import java.util.Scanner;

/**
 *
 * @author Sathya
 */
public class StringHandling2 {
    
    
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the genome as a string: ");
        String gene=scan.nextLine();
        String genome=gene.toUpperCase();
        String str;
        String[] ls=new String[15];
        int con=0;
        int flag=0;
        for(int i=0;i<genome.length()-3;i++)
        {
            if(genome.substring(i).startsWith("ATG"))
            {
                str=genome.substring(i+3);
                for(int j=0;j<str.length();j++)
                {
                    if(str.substring(j).startsWith("TAA")||str.substring(j).startsWith("TGA")||str.substring(j).startsWith("TAG"))
                    {
                        ls[con]=genome.substring(i+3,i+j+3);
                        con=con+1;
                        flag=1;
                    }
                }
            }
        }
        System.out.println("Genes Found are");
        for(int i=0;ls[i]!=null;i++)
            System.out.println(ls[i]);
        if(flag==0)
            System.out.println("Genes cannot be found!!");
    } 
}

    

