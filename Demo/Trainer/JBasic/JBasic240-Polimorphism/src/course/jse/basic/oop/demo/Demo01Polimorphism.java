package course.jse.basic.oop.demo;

import java.util.Scanner;

import course.jse.basic.oop.domain.Date;
import course.jse.basic.oop.domain.Employee;
import course.jse.basic.oop.domain.Manager;

public class Demo01Polimorphism {

	
	private static Scanner scanner;
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		
		Employee[] staff = new Employee[2];
		staff[0]= new Employee("Stefano", 1000.0, new Date(12,12,2018));
		
		//1) UPCAST
		staff[1]= new Manager("Anton", 1000.0, new Date(12,12,2018),50);
		
		
		System.out.println("Original Data:");
		printCurrentStaffData(staff);
		
		increaseSalaryToAll(staff,5.0);
		
		System.out.println("After Increase Salary:");
		printCurrentStaffData(staff);
		
		scanner.close();		
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
