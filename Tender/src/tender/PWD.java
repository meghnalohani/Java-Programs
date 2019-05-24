/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tender;
import java.util.Scanner;

public class PWD extends Thread implements tender_interface {
    
    
    
    public void store_details()
    {
        String tname, type,place;
        double budget;
        int timeline;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Tender name : ");
        tname=sc.nextLine();
        System.out.print("Enter Tender type : ");
        type=sc.nextLine();
        System.out.print("Enter Budget : ");
        budget=sc.nextDouble();
        System.out.print("Enter Location : ");
        place=sc.next();
        System.out.print("Enter the Timeline i.e no of months : ");
        timeline=sc.nextInt();
        Tender td=new Tender(tname,type,budget,place,timeline);
        
        
    }
    public void calculate_rank(LnT c1,Tata c2, Reliance c3)
    {
        
        int total_projects[]=new int[3];
        int total_delay[]=new int[3];
        int total_value[]=new int[3];
        //LnT c1=new LnT();
        //c1.store_details();
        //total_projects[0]=c1.numprojects;
        //total_delay[0]=c1.delay;
        //total_value[0]=c1.totalvalue;
        Thread t1=new Thread()
        {
            public void run()
            {
        //LnT c1=new LnT();
        //c1.store_details();
        total_projects[0]=c1.numprojects;
        total_delay[0]=c1.delay;
        total_value[0]=c1.totalvalue;
            }
        };
                
        Thread t2=new Thread()
        {
            public void run()
            {
        //Tata c2=new Tata();
        //c2.store_details();
        total_projects[1]=c2.numprojects;
        total_delay[1]=c2.delay;
        total_value[1]=c2.totalvalue;
            }
        };
        
        Thread t3=new Thread()
        {
                
           public void run()
            {
        //Tata c3=new Tata();
        //c3.store_details();
        total_projects[2]=c3.numprojects;
        total_delay[2]=c3.delay;
        total_value[2]=c3.totalvalue;
            }
        };
        t1.start();
        t2.start();
        t3.start();
        
try{
      t1.join();
      
                
    }
catch(InterruptedException e)
{}
int projects_rank[]={1,2,3};
int value_rank[]={1,2,3};
int delay_rank[]={1,2,4};

//0-> Lnt
//1-> Tata
//2->Reliance
class Sort_Arrays
{   

    int[] array_sort(int tp[],int tr[])
    {
        int i,j,k,t1,t2;
        for(i=0;i<3;i++)
        {
            for(j=i;j<3;j++)
            {
                if (tp[i]<tp[j])
                {
                    t1=tp[i];
                    tp[i]=tp[j];
                    tp[j]=t1;
                    t2=tr[i];
                    tr[i]=tr[j];
                    tr[j]=t2;
                   
                    
                
                }
            }
        }
         return (tr);
    }
}

Sort_Arrays s1=new Sort_Arrays();
int pr[]=s1.array_sort(total_projects, projects_rank);
Sort_Arrays s2=new Sort_Arrays();
int vr[]=s2.array_sort(total_value,value_rank);
Sort_Arrays s3=new Sort_Arrays();
int dr[]=s3.array_sort(total_delay,delay_rank);
int lnt_r,tata_r,rel_r;
Ranking r1=(int a)->((pr[a]+vr[a]+dr[a])/3);
lnt_r=r1.compute_ranks(0);
tata_r=r1.compute_ranks(1);
rel_r=r1.compute_ranks(2);
if(lnt_r>tata_r && lnt_r>rel_r)
    System.out.println("LnT is winner");
else if(tata_r>lnt_r && tata_r>rel_r)
    System.out.println("Tata is winner");
else
    System.out.println("Reliance is winner");


    

    
    
}
    
}