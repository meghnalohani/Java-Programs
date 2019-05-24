/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;
import java.util.Scanner;

public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public  void main() {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {System.out.println("Divide by 0 error"+e);
        }
        
    }
    
}
