package course.jse.collections.generics.demo;

import course.jse.collections.generics.domain.BoxUntyped;

public class Demo01UntypedBox {

	
	public static void main(String[] args) {
		
		
		BoxUntyped boxOfStrings= new BoxUntyped();
		BoxUntyped boxOfInteger= new BoxUntyped();
		BoxUntyped boxOfDouble= new BoxUntyped();
		
		
		//everything is allowed here...
		boxOfStrings.addContent("A String content");
		boxOfStrings.addContent(new Integer (0));
		boxOfStrings.addContent(new Double(9.0));
		
		//cast and Type checking at runtime..
		String contentAsString =(String)boxOfStrings.getContent();
		
	}
}
