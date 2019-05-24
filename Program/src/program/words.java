/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Scanner;

/**
 *
 * @author eg3
 */
public class words {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        
        String ones[]={"","one","two","three","four","five","six","seven","eight","nine"};
        String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String tenth[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String hundred=" hundred ";
        String thousand=" thousand ";
        int f=1;
        do
        {
            System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        int num[]=new int[4];
        int r,pos=3,i;
        String word="";
        while(pos>=0)
        {
            num[pos]=n%10;
            pos--;
            n=n/10;
        }
        
        for(i=0;i<4;i++)
        {int a=num[i];
        if(a!=0 && i==0)
            word=word+ones[a]+thousand;
        else if(a!=0 && i==1)
            word=word+ones[a]+hundred;
        else if(a!=0 && (i==2 && a==1))
        {r=num[3];
            word=word+tenth[r]+" ";
        i++;}
        else if(a!=0 && (i==2 && a!=1))
            word=word+tens[a]+" ";
        else if(i==3)
            word=word+ones[a]+" ";
        }
            
        System.out.println(m+" : "+word);
        System.out.println("Do you wish to continue? Enter 1 for yes and 0 for no");
        f=sc.nextInt();
        }
        while(f==1);
       

        
        }
}
