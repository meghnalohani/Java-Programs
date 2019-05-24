package filehandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {

    String Name,Addr,No;
    static String file="C:\\Users\\Sathya\\Desktop\\VIT\\VIT 6th sem\\JAVA\\LAB\\config.txt";
    public void getFileContent()throws IOException 
    {
        String name="",address="",phoneno="";
        String word;
        System.out.println("-----Displaying contents of the file------\n");
                
                FileInputStream fileStream = new FileInputStream(file); 
                BufferedReader br=new BufferedReader(new InputStreamReader(fileStream));
                while((word=br.readLine())!=null)
                {
                   
                    String[] words=word.split(":");
                    int len=words.length;
                    if(len==0 || len==1)
                        continue;
                    String key=words[0];
                    String value=words[1];
        
                    if(key.equals("Name"))
                    {   name=value;
                        System.out.println("Name "+name);
                    }
        
                    if(key.equals("Address"))
                    {   address=value;  
                        System.out.println("Address "+address);
                    }
                     if(key.equals("Number"))
                    {phoneno=value;
                     System.out.println("Phone number "+phoneno);
                    }
                
            }
                System.out.println("---------------------------------------------\n\n");
                fileStream.close();
            }
    
    public void modifyFile()throws IOException
    {
        
    System.out.println("\tEnter choice \n \t1. Add Name \n \t2. Add Address \n \t3. Add Phone Number\n");
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        String val,val2,val3;
        String word;
          switch(inp)
        {
            
            case 1: {
                FileOutputStream out=new FileOutputStream(file,true);
               System.out.println("Enter the Name");
                val=sc.next(); 
                val2="\nName:"+val+"\n";
                byte[] store=val2.getBytes();
                out.write(store);
                 out.close();
                break;
               
                   }
            case 2: {
                 FileOutputStream out=new FileOutputStream(file,true);
                System.out.println("Enter the Address");
                val=sc.next();
                val2="\nAddress:"+val+"\n";
                byte[] store=val2.getBytes();
                out.write(store);
                out.close();
                break;
                   }
            case 3: {
                FileOutputStream out=new FileOutputStream(file,true);
                System.out.println("Enter the Phone number");
                val=sc.next();
                val2="\nNumber:"+val+"\n";
                byte[] store=val2.getBytes();
                out.write(store);
                out.close();
                break;
                   }
            
            
            default:System.out.println("Invalid choice");
        }
            
        
        
        
        
        
        
        System.out.println("File modified successfully");
        
        
        
    }
    
    }
    
    
            
        
        
        
        
        
        
        
        
          
        
            
        
   
        
      
