package course.jse.basic.oop.demo;

import java.util.Scanner;

import course.jse.basic.oop.domain.geometry.Circle;
import course.jse.basic.oop.domain.geometry.Rectangle;
import course.jse.basic.oop.domain.geometry.Shape;

public class Demo01Geometry {

	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		 scanner = new Scanner(System.in);
		 
		 Shape shape=inputFromUI();		 
		 System.out.println("Area of Selected Shape is "+shape.calculateArea());
		 
		 scanner.close();	
		
	}
	
	
	
	public static Shape inputFromUI(){
		
		String shapeChosed =null;	
		
		do{
			System.out.println("Choose Shape [C=Circle | Rectangle]");
			shapeChosed =scanner.next();
			
		}while (!shapeChosed.equalsIgnoreCase("C") && !shapeChosed.equalsIgnoreCase("R"));
		
		
		switch (shapeChosed){
		
		case "C":
			System.out.println("Insert radius");
			double radius=scanner.nextDouble();
			Circle circle = new Circle();
			circle.setRadius(radius);
			return circle;
			
		case "R":
			System.out.println("Insert Width");
			double width=scanner.nextDouble();
			System.out.println("Insert Height");
			double height=scanner.nextDouble();
						
			Rectangle rectangle = new Rectangle();
			rectangle.setWidth(width);
			rectangle.setHeight(height);		
			return rectangle;
			
		default: throw new IllegalStateException("Illegal Selection");
			
		}
		
	
	}
}
