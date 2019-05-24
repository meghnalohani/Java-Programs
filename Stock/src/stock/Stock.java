/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.util.Scanner;
public class Stock {
    int q;
    double p;
    Stock(int qty,double price)
    {q=qty;
    p=price;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the times stock purchased");
        int t=sc.nextInt();
        int i;
        Stock[] sobj=new Stock[t];
        for(i=0;i<t;i++)
        {
            System.out.println("Enter the number of stocks purchased at time "+(i+1));
            int num=sc.nextInt();
            System.out.println("Enter the price of each stock");
            double pr=sc.nextDouble();
            sobj[i]=new Stock(num,pr);
        }
        System.out.println("Stocks purchased :");
        for(i=0;i<t;i++)
        {
            System.out.println(sobj[i].p+" "+sobj[i].q);
        }
        System.out.println("Enter the number of stocks to be sold");
        int ts=sc.nextInt();
        int ts2=ts;
        System.out.println("Enter the price at which each stock is to be sold");
        double sp=sc.nextDouble();
        double sp2=sp*ts;
        System.out.println("Total selling price is "+sp2);
        double cp=0.0;
        int j=0,cs=0;
        while(ts>0)
        {
            int ns=sobj[j].q;
            if(ts>=ns)
            {
                cp=cp+sobj[j].p*ns;
                cs=cs+ns;
                ts=ts-ns;
                j++;
            }
            else
            {   int req=ns-ts;
                cp=cp+sobj[j].p*req;
                cs=cs+req;
                ts=ts-req;
                j++;
                
            }
        }
        
            double acp=cp/cs;
            System.out.println("Avearge cost price of "+ts2+" stocks is "+acp);
            double cp2=acp*ts2;
            System.out.println("Total cost price is "+cp2);
            System.out.println("Total selling price is "+sp2);
            
            double diff=sp2-cp2;
        
            if(diff>0)
            {
                System.out.println("Profit : "+diff);
            }
            else
            {   double l=-1*diff;
                System.out.println("Loss: "+diff);
            }
            
        }
        
}
    
            

    
    
    

