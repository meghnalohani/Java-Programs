/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Principle : ");
    float p=sc.nextFloat();
    System.out.println();
    System.out.print("Rate : ");
    float r=sc.nextFloat();
    System.out.println();
    System.out.print("Time(years) : ");
    float t=sc.nextFloat();
    System.out.println();
    float i=(p*r*t)/100;
    System.out.println("Simple Interest : "+i);
    
        }
}

