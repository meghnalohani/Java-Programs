
package filehandling;
import java.io.*;
import java.util.Scanner;

public class File_Main {
    
    public static void main(String[] args)throws IOException
    {
        FileHandling files[]=new FileHandling[100];
        int i=0;
        System.out.println("*****FILE OPERATIONS********");
        System.out.println("Enter a choice\n1. Display file content\n2. Modify file contents\n3. Exit");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        while(ch!=3)
        {    files[i]=new FileHandling();
            outer:
            switch(ch){
                case 1:
                {files[i].getFileContent();
                break;}
                
                
            
            case 2:{
                files[i].modifyFile();
                break;
            }
            case 3:{
                System.out.println("********THANK YOU*********");
                break outer;
            }
            
        }
            i+=1;
         System.out.println("Enter a choice\n1. Display file content\n2. Modify file contents\n3. Exit");  
         ch=sc.nextInt();
        }
        
            
        }
        
        
    }
    
