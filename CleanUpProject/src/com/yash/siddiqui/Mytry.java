package com.yash.siddiqui;

public class Mytry {

	public static void main(String args[]) {
	
		int count = 0;
		int maxTries = 5;
		while(true) {
		    try {
		    	Thread.sleep(20000);
		    	System.out.println("We are in Retry");
		    
		    	System.out.println("File Sent using retry");
		    	break;
		    } catch (Exception ex) {
		    	System.out.println("retrying for"  + count+  "Time");
		    	try {
		    		if (++count == maxTries) {
		    			break;
		    		}
		    		
		    	}
		    	catch (Exception ex1){
		    		System.out.println("Fail");
		    	}
		    	 
		    	
		    }
		}
		
		
}
}