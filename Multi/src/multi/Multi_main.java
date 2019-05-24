/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author Sathya
 */
public class Multi_main {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
               final Multi acc = new Multi(); 
		
		
		Thread t1 = new Thread("Thread - 1")
		{  
		public void run()
		{
			acc.withdraw(15000);
		
		}  
		};
		
		Thread t2 = new Thread("Thread - 2")
		{  
		public void run(){acc.deposit(10000);}  
		};
		
		
		Thread t3 = new Thread("Thread - 3"){  
			public void run()
			{
				acc.withdraw(1500);
			
			}  
			}; 
		
			t1.start();
			 
	        t2.start();
	        
	        t3.start();
	}
	}

	



	
   

