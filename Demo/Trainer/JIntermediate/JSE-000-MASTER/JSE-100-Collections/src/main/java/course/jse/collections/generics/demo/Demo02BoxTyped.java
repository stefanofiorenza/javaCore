package course.jse.collections.generics.demo;

import course.jse.collections.generics.domain.Box;

public class Demo02BoxTyped {

	
	public static void main(String[] args) {
		
		
		Box<String> boxOfStrings= new Box<String>();
		Box<Integer> boxOfInteger= new Box<Integer>();
		Box<Double> boxOfDouble= new Box<Double>();
		
		
		//everything is allowed here...
		boxOfStrings.addContent("A String content");
		
		//this is now illegal at compile time!!
		//boxOfStrings.addContent(new Integer (0));
		//boxOfStrings.addContent(new Double(9.0));
		
		//cast and Type checking at runtime not necessary anymore
		String contentAsString =boxOfStrings.getContent();
		
	}
}
