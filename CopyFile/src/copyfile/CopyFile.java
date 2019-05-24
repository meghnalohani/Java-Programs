/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfile;
import java.io.*;
public class CopyFile {

    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        FileInputStream in=null;
        FileOutputStream out=null;
        try
        {
            in=new FileInputStream("C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\input.txt");
            out=new FileOutputStream("C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\output.txt");
            
        }
        catch()
                {
                    
                }
    }
    
}
