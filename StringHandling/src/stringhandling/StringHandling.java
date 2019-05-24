/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;
import java.util.Scanner;

public class StringHandling {

    String S;
    
    StringHandling(String s)
    {
    S=s;}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a chemical equation");
        String e=sc.nextLine();
        e=e.trim();
        String E=e;
        StringHandling obj=new StringHandling(E);
        obj.removeSpaces();
        obj.display();
        obj.balance();
        
        obj.display();
        obj.findReactants();
        obj.findProducts();
        
        
    }
    void removeSpaces()
    {
    String news="";
        int i;
        for(i=0;i<S.length();i++)
        {if(S.charAt(i)==' ')
            news=news+"";
        
            
        else
            news=news+S.charAt(i);
        }
        S=news;
    }
    void balance()
    {String news2="";
    int i;char ch;
    for(i=0;i<S.length();i++)
    {ch=S.charAt(i);
     
        if(ch=='+')
    {char cx=S.charAt(i+1);
    if (!Character.isDigit(cx))
        news2=news2+ch+"1";
    }
    else
        news2=news2+ch;
    }
    S=news2;
    }
    void display()
    {System.out.println(S);}
    void findReactants()
    {   boolean flag=true;
        int pos=S.indexOf('-');
        int spos=0;
        String r="+"+S.substring(0,pos)+"+";
        System.out.println(r);
        int i;char ch;
        while(flag)
        {
            int p1=r.indexOf("+",spos);
            System.out.println(p1);
            int j=p1;
         
            ch=r.charAt(j+1);
            if(!Character.isDigit(ch))
                while(Character.isDigit(ch))
                {   j=j+1;
                    ch=r.charAt(j);
            }
            int pref=Integer.parseInt(r.substring(p1+1,j+1));
            System.out.println(pref);
            int p2=j+1;
            int p3=r.indexOf("+",j);
            if(p3==r.length()-1)
                break;
           
            String reac=r.substring(p2,p3);
            System.out.println(reac);
            System.out.println(pref+" moles of "+reac+" required");
            spos=p3;
            
            if(spos==r.length()-1 || j==r.length()-1)
                flag=false;
            
            
        }
        
    }
    void findProducts()
    {boolean flag=true;
        int pos=S.indexOf('-');
        int spos=0;
        String pr="+"+S.substring(pos+1,S.length())+"+";
        System.out.println(pr);
        int i;char ch;
        while(flag)
        {
            int p1=pr.indexOf("+",spos);
            System.out.println(p1);
            int j=p1;
         
            ch=pr.charAt(j+1);
            if(!Character.isDigit(ch))
                while(Character.isDigit(ch))
                {   j=j+1;
                    ch=pr.charAt(j);
            }
            int pref=Integer.parseInt(r.substring(p1+1,j+1));
            System.out.println(pref);
            int p2=j+1;
            int p3=pr.indexOf("+",j);
            if(p3==pr.length()-1)
                break;
           
            String reac=pr.substring(p2,p3);
            System.out.println(reac);
            System.out.println(pref+" moles of "+reac+" required");
            spos=p3;
            
            if(spos==pr.length()-1 || j==pr.length()-1)
                flag=false;
            
            
        
    
    }
    
}
