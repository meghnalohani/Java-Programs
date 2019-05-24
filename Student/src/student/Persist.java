/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.*;
/**
 *
 * @author Sathya
 */
public class Persist {
    public static void main(String[] args)throws Exception
    {
    Student s1=new Student(211,"Ravi");
    FileOutputStream fout=new FileOutputStream("C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\f.txt");
    ObjectOutputStream out=new ObjectOutputStream(fout);
    out.writeObject(s1);
    System.out.println("succsess");
    
            }
}
