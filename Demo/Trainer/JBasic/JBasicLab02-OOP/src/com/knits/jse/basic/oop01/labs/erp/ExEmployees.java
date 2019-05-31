package com.knits.jse.basic.oop01.labs.erp;

import java.util.Scanner;

import com.knits.jse.basic.oop02.domain.Date;
import com.knits.jse.basic.oop02.domain.Employee;

public class ExEmployees {

	
	private static Scanner scanner;
	
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		//1)Create an Array of (3) Employee and set their data from Scanner (Console) 
		Employee [] employees = new Employee[3];
		
		for (int i=0; i<employees.length; i++){
			employees[i]=insertEmployeeData();
		}
				
		//2) Print inserted data System.out.println (Console) 
		for (int i=0; i<employees.length; i++){
			printData(employees[i]);
		}
		
		scanner.close();	
	}
	
	
	private static Employee insertEmployeeData(){
		
		System.out.println("Insert Employee");
		
		System.out.println("Insert Name:");	      
		String name= scanner.next();
	      
		System.out.println("Insert Salary:");
		double salary= scanner.nextDouble();
						
		System.out.println("Insert Hire Date:");
		Date hireData= insertDate();
	      
		Employee emp = new Employee(name, salary, hireData);		
		return emp;
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
	
	
	private static void printData(Employee manager){
		System.out.println("******************\nEmployee Data: "+
				"\nName: "+manager.getName()+
				"\nSalary: "+manager.getSalary()+
				"\nHired Date: "+manager.getHireDate().getDay()+"/"
				+manager.getHireDate().getMonth()+"/"
				+manager.getHireDate().getYear());		
		
	}

}
