/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

public class Multi {  
	int amount=10000; 
        
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount)
	{  
	System.out.println("Less balance; waiting for deposit..."+this.amount);  
	try{wait();}
	
	catch(Exception e){}  
	}  
	this.amount-=amount;  
	System.out.println("withdraw completed..."+this.amount);  
	}  
	  
	synchronized void deposit(int amount){  
	System.out.println("going to deposit..."+this.amount);  
	this.amount+=amount;  
	System.out.println("deposit completed... "+this.amount);  
	notify();  
	}  
}

