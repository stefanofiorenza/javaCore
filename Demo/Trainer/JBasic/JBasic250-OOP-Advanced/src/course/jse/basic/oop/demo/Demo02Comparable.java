package course.jse.basic.oop.demo;

import java.util.Arrays;

import course.jse.basic.oop.domain.erp.Date;
import course.jse.basic.oop.domain.erp.Employee;

public class Demo02Comparable {

	public static void main(String[] args) {


		Comparable [] comparableObjects = new Comparable [3];
		fillArrayWithObjects(comparableObjects);
		
		System.out.println("Before Ordering");
		printArray(comparableObjects);
		
		Arrays.sort(comparableObjects);
		
		System.out.println("After Ordering");
		printArray(comparableObjects);

	}
	
	
	private static void fillArrayWithObjects(Comparable [] comparableObjects){
		
		comparableObjects[0]= new Employee("Stefano", 1000.0, new Date(12,12,2009));
		comparableObjects[1]= new Employee("Marko", 2000.0, new Date(12,12,2009));
		comparableObjects[2]= new Employee("Paul", 3000.0, new Date(12,12,2009));
	}
	
	private static void printArray(Comparable [] elements){

		for (Comparable comparable : elements){
			System.out.println(comparable.toString());
		}
	}

}
