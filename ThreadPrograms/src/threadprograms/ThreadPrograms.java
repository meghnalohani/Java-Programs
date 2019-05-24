/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprograms;

/**
 *
 * @author Sathya
 */




class Multi extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			 try
			 {
				 Thread.sleep(500);
				 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
				 }  
			    System.out.println(i);
                System.out.println(Thread.currentThread().getName());}
		}
	 
	}  
