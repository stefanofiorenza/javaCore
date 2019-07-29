package course.jse.collections.generics.demo;

import java.util.ArrayList;
import java.util.List;

import course.jse.collections.generics.domain.Box;

public class Demo03MethodErasure {

	public static void main(String[] args) {

									//static method with erasure
		Box<String> aStringBoxed= Box.wrapIntoABox("A Content");
		Box<Integer> anIntegerBoxed= Box.wrapIntoABox(new Integer(9));
		Box<Double> aDoubleBoxed= Box.wrapIntoABox(new Double (9.90));
		
		// ? = Object
		List<Box<?>> boxes = new ArrayList<Box<?>>();
		boxes.add(aStringBoxed);
		boxes.add(anIntegerBoxed);
		boxes.add(aDoubleBoxed);
		
		
		for (Box<?> box :  boxes) {
			System.out.println(box.getContent());
			System.out.println(box.getContentClass().getCanonicalName());
		}

	}

	
	
	
}
