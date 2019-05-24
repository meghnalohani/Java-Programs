/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.Serializable;
public class Student implements Serializable {

    /**
     * @param args the command line arguments
     */
    public int id;
    public String name;
     public Student(int id,String name)
        {this.id=id;
        this.name=name;
            
        }
  
    
}
