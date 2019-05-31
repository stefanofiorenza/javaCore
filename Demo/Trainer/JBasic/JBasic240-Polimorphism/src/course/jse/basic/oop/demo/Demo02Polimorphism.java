package course.jse.basic.oop.demo;

import java.util.Scanner;

import course.jse.basic.oop.domain.Date;
import course.jse.basic.oop.domain.Employee;
import course.jse.basic.oop.domain.Manager;

public class Demo02Polimorphism {

	
	private static Scanner scanner;
	
	public static void main(String[] args) {

		 scanner = new Scanner(System.in);
		
		
		 Employee[] staffForSalaryRaise =new Employee[3];
			
		 for (int i=0; i<staffForSalaryRaise.length; i++){
			 staffForSalaryRaise[i]=insertStaffMember(); 	
		 }
		 
				
		System.out.println("Original Data:");
		printCurrentStaffData(staffForSalaryRaise);
		
		increaseSalaryToAll(staffForSalaryRaise,5.0);
		
		System.out.println("After Increase Salary:");
		printCurrentStaffData(staffForSalaryRaise);
		
		scanner.close();		
	}
	
	
	private static Employee insertStaffMember(){
		
		System.out.println("Insert Staff Member Type (E - Employee || M - Manager:");
		String staffType= scanner.next();
		
		switch(staffType){		
			case "E": return inserteEmployeeData();
			case "M": return insertManagerData();
			default: throw new IllegalStateException("Illegal staffType: "+staffType+" expected either E or M.");	
		}
		
	}
	
	private static Employee inserteEmployeeData(){
		
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
	
	private static void increaseSalaryToAll(Employee[] staff, double increaseRatio){
		for (int i=0; i<staff.length; i++){
			staff[i].increaseSalary(increaseRatio);//2) Verify here LATE BINDING
		}		
	}
	
	private static void printCurrentStaffData(Employee[] staff){
		for (int i=0; i<staff.length; i++){
			printData(staff[i]);
		}
	}
	
	
	private static void printData(Employee employee){
		System.out.println("******************\nStaff Data: \nName: "+employee.getName()+
				"\nSalary: "+employee.getSalary()+
				"\nHired Date: "+employee.getHireDate().getDay()+"/"
				+employee.getHireDate().getMonth()+"/"
				+employee.getHireDate().getYear());		
		
	}

}
