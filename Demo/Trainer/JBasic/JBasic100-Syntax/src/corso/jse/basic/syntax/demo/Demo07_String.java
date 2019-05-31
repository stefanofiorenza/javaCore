package corso.jse.basic.syntax.demo;

public class Demo07_String {


	public static void main(String[] args) {
		
	  //declaration of String vars
      String aString;  
      String anotherString; 
      
      
      //instantiation (construction) of a String vars
      aString = new String("A Test String"); //memory allocation and data inserted in var 
      
      //same as before, but with a shortcut
      anotherString = new String("Another test String"); 
      
      
      //once an Object is initialized it could be used with methods  object.method
      char firstCharInString = aString.charAt(0);
      System.out.println(firstCharInString);
      
	
	}
}
