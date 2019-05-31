package corso.jse.basic.syntax.demo;

import java.util.Scanner;

class Demo06_Arrays{ 
    
   
    public static void main(String[] args) { 

    	Scanner scanner = new Scanner(System.in);
    	
		//Array var declaration
        int[] data;
        
        // Array instantiation  (setup array lenght)
        data = new int[5] ; // lenght= 5
        
        
        // Array data insert loop (watch length property)
        for(int i=0;i<data.length; i++){
        	System.out.println("Insert Number");
        	data[i]= scanner.nextInt();	
        }        
           	        
        
        // Array data print loop 
        System.out.println("Print Array");
        for(int i=0;i<data.length; i++){
        	System.out.println(data[i]);	
        }   
        
        
        scanner.close();
    } 
}
    
    
    
 