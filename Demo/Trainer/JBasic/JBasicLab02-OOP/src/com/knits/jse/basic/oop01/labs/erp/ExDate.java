package com.knits.jse.basic.oop01.labs.erp;

import java.util.Scanner;

import com.knits.jse.basic.oop02.domain.Date;


public class ExDate {

	private static Scanner scanner;
	
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		Date[] dateArray = new Date[3];
      
	    for (int i=0; i<dateArray.length; i++){
	    	 dateArray[i]=insertDate();
	    }
		
	    for (int i=0; i<dateArray.length; i++){
	    	 System.out.println("Date: "+dateArray[i].toString());
	    }
      
		
      System.out.println("\nUpdate Date to (manual set) 1/1/1900");
      dateArray[0].setDay(1);
      dateArray[0].setMonth(1);
      dateArray[0].setYear(1900);
      
	  System.out.println("Updated Date: " + dateArray[0].toString());
	  
	  scanner.close();
	}

	
	private static Date insertDate(){
	 		
	      System.out.println("Insert Day:");	      
	      int dd = scanner.nextInt();
	      
	      System.out.println("Insert Month:");
	      int mm = scanner.nextInt();
	      
	      System.out.println("Insert Year:");
	      int yy = scanner.nextInt();
	   	      
	      return new Date(dd,mm,yy);	    
	}
} 
