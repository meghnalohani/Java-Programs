/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Scanner;

/**
 *
 * @author eg1
 */
public class Program {
    

    /**
     * @param args the command line arguments
     */
    int one,two,five,ten,fifty,hun,amt,bal,camt;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        Program obj=new Program();
        obj.updatecash();
        int flag=1,c=1;
        while(flag==1)
        {System.out.println("Customer "+c+" : ");
        c++;
        obj.recordSaleValue();
        obj.giveChange();
        obj.balanceEnquiry();
        System.out.println("Do you wish to continue? Enter 1 for yes and 0 for no");
        int opt=sc.nextInt();
        flag=opt;
        
        }
        
        
        
        
    }
    
   void updatecash()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("--ENTER THE INITIAL STATUS OF CASH REGISTER--\n");
       System.out.println("Enter the number of 1 rs. coins\n");
       one=sc.nextInt();
       System.out.println("Enter the number of 2 rs. coins\n");
       two=sc.nextInt();
       System.out.println("Enter the number of 5 rs. coins\n");
       five=sc.nextInt();
       System.out.println("Enter the number of 10 rs. coins\n");
       ten=sc.nextInt();
       System.out.println("Enter the number of 50 rs. notes\n");
       fifty=sc.nextInt();
       System.out.println("Enter the number of 100 rs. notes\n");
       hun=sc.nextInt();
      
      
       
   }
   void recordSaleValue()
   {Scanner sc=new Scanner(System.in);
   System.out.println("Enter the amount to be paid\n");
   amt=sc.nextInt();
   System.out.println("Enter the amount paid by the customer\n");
   camt=sc.nextInt();
   System.out.println("Enter the count of each denomination as given by the customer\n");
   System.out.print("One :");
   one=one+sc.nextInt();
   System.out.print("Two :");
   two=two+sc.nextInt();
   System.out.print("Five :");
   five=five+sc.nextInt();
   System.out.print("Ten :");
   ten=ten+sc.nextInt();
   System.out.print("Fifty :");
   fifty=fifty+sc.nextInt();
   System.out.print("Hundred :");
   hun=hun+sc.nextInt();
   
   
   
   }
   void giveChange()
   {boolean ca=true;
       System.out.println(camt);
   System.out.println(amt);
       int no=0,nt=0,nfv=0,nten=0,nf=0,nh=0;
       bal=camt-amt;
       System.out.println("Chnage to be returned : "+bal);
   if(bal==0)
       System.out.println("No change required\n");
     
   else
   {
       nh=bal/100;
       if(nh>hun)
       {nh=hun;
       }
       
       bal=bal-nh*100;
       }
       
       nf=bal/50;
       if(nf>fifty)
       {nf=fifty;}
       bal=bal-nf*50;
       
       
       nten=bal/10;
       if(nten>ten)
       {
       nten=ten;}
       bal=bal-nten*10;
       nfv=bal/5;
       if(nfv>five)
       {nfv=five;
       }
       bal=bal-5*nfv;
       nt=bal/2;
       if(nt>two)
       {nt=two;
       }
       bal=bal-nt*2;
       if(bal>one)
       {ca=false;
       }
       else
       {no=bal;
       }
       
       
       if(ca)
       {
           hun=hun-nh;
       fifty=fifty-nf;
       ten=ten-nten;
       five=five-nfv;
       two=two-nt;
       one=one-no;
       System.out.println("CHANGE TO BE RETURNED--\n");
       System.out.println("One :"+no+"\n");
   System.out.println("Two :"+nt+"\n");
   System.out.println("Five :"+nfv+"\n");
   System.out.println("Ten :"+nten+"\n");
   System.out.println("Fifty :"+nf+"\n");
   System.out.println("Hundred :"+nh+"\n");}
       else
       {System.out.println("Change not available");
       }
       
       
       
           
   }
   
   
   void balanceEnquiry()
   {
   System.out.println("--CASH REGISTER--\n");
   System.out.println("One :"+one+"\n");
   System.out.println("Two :"+two+"\n");
   System.out.println("Five :"+five+"\n");
   System.out.println("Ten :"+ten+"\n");
   System.out.println("Fifty :"+fifty+"\n");
   System.out.println("Hunderd :"+hun+"\n");}
   
}

