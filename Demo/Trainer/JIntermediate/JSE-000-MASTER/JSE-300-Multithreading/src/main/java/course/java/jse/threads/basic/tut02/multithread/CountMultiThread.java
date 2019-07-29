package course.java.jse.threads.basic.tut02.multithread;

public class CountMultiThread  extends Thread{
	
	
	public CountMultiThread (String nome){
		
		super(nome);	
	}
	
	
	public void count(){
		
		int i=0;
		while (i<100){
			
			i++;
			try {
				Thread.sleep(1000);
				System.out.println("Thread Name: "+this.getName()+" : Count N."+ i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			
		}
		
	}


	@Override
	public void run() {
		count();
	}
	
	
	
	
	
	
	
	
}