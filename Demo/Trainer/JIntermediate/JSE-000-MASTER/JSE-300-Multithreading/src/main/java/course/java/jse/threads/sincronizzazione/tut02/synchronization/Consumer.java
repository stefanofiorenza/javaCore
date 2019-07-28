package course.java.jse.threads.sincronizzazione.tut02.synchronization;

public class Consumer implements Runnable{
	
	
	Repository c;
	public Consumer(Repository v){
		c=v;
	}	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Consumer reads : "+c.getData());
			try
			{
				Thread.sleep((long)(1000*Math.random()));
			}	
			catch(Exception e)
			{		
			}	
		}
	}	
}