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


public class Multi_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                Multi t1=new Multi(); 
		Multi t2= new Multi();
		Multi t3= new Multi();
		t1.start();  
		try{  
			  t1.join();  
			 }
		catch(Exception e)
		{System.out.println(e);}  
		t2.start();
		t3.start();
	}

}
