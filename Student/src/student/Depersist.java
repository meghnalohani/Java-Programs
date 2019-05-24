
package student;

import java.io.*;
public class Depersist {
    
    public static void main(String[] args)throws Exception
    {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\f.txt"));
        Student s=(Student)in.readObject();
        System.out.println(s.id+" "+s.name);
        in.close();
    }
    
}
