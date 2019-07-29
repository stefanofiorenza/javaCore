package course.java.jse.threads.basic.tut01.monothread;

public class CountMonoThread  {
	
	
	String name;
	
	public CountMonoThread (String n){
		
		this.name=n;	
	}
	
	
	public void count(){
		
		int i=0;
		while (i<100){
			
			i++;
			System.out.println("Thread Name "+this.name+" : Count N."+ i);
			
		}
		
	}
	
	
	
	
	
	
	
	
}