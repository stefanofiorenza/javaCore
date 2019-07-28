package course.java.jse.threads.sincronizzazione.tut02.synchronization;


public class Producer implements Runnable{
	
	Repository c;
	public Producer(Repository v)
	{
		c=v;
	}	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			int value;
			value=(int)(10*Math.random());
			c.setData(value);
			System.out.println("Producer Inserted : "+value);
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