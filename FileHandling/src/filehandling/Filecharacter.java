/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Sathya
 */
public class Filecharacter {
    
    public static void main(String[] args)throws IOException
    
    {
        File f=new File("C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\abc.txt");
    String file="C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\\"JAVA\\LAB\\config.txt";
    
    String a="meghna";
    FileWriter fw=new FileWriter(f);
    fw.write(a);
    fw.close();
    FileReader fr=new FileReader(f);
    Scanner sc=new Scanner(fr);
    while(sc.hasNext())
        System.out.println(sc.next());
    
}
}