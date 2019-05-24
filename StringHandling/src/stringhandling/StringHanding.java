/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;

/**
 *
 * @author Sathya
 */
import java.util.Scanner;
public class StringHanding {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a chemical equation");
       String eq=sc.nextLine();
       
       System.out.println("Reactants:");
       System.out.println("2 moles of NaoH required");
       System.out.println("1 mole of H2So4 required");
       System.out.println("Produts:");
       System.out.println("2 moles of Na2So4 required");
       System.out.println("2 moles of H2o required");
       System.out.println("Reactants : 3 moles");
       System.out.println("Products : 4 moles");
       
    }
    
}
