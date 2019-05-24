/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;
import java.util.Scanner;
public class Number {
    int m,n;
    void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        m=sc.nextInt();
        n=sc.nextInt();
    }
    void divide()
    {try{
        int d=m/n;
        System.out.println(d);
    }
        catch(ArithmeticException e){
            System.out.println("divide by 0"+e);
           
        }
    finally //always executes
    {System.out.println("This is the finally block");
    }
        
    
    }
}
