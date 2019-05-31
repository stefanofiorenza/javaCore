package com.knits.jse.basic.oop01.labs.erp;

import java.util.Scanner;

import com.knits.jse.basic.oop02.domain.Date;
import com.knits.jse.basic.oop02.domain.Manager;

public class ExManagers {

	
	private static Scanner scanner;
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		
		//1) Create an Array of (3) Manager and set their data from Scanner (Console)
		Manager[] mangers = new Manager[3];
		
		for (int i=0; i<mangers.length; i++){
			mangers[i]=insertManagerData();
		}
		
		
		//2) Print inserted data System.out.println (Console) 
		for (int i=0; i<mangers.length; i++){
			printData(mangers[i]);
		}
		
		scanner.close();		
	}
	
	
	
	private static Manager insertManagerData(){
			
		System.out.println("Insert Employee");
		
		System.out.println("Insert Name:");	      
		String name= scanner.next();
	      
		System.out.println("Insert Salary:");
		double salary= scanner.nextDouble();
		
		System.out.println("Insert No Projects:");
		int projects= scanner.nextInt();
		
		System.out.println("Insert Hire Date:");
		Date hireData= insertDate();
	      
		Manager manager = new Manager(name, salary, hireData, projects);
		
		return manager;
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
	
	
	private static void printData(Manager manager){
		System.out.println("******************\nManager Data: \nName: "+manager.getName()+
				"\nSalary: "+manager.getSalary()+
				"\nProjectsSupervised: "+manager.getManagedProjects()+
				"\nHired Date: "+manager.getHireDate().getDay()+"/"
				+manager.getHireDate().getMonth()+"/"
				+manager.getHireDate().getYear());		
		
	}

}
