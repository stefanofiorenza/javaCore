package course.java.jse.threads.basic.tut02.runnable;

public class CountRunnable implements Runnable{
	
	private String nome;
	
	public CountRunnable (String nome){
		this.nome=nome;	
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void conta(){
		
		int i=0;
		while (i<100){
			
			i++;
			try {
				Thread.currentThread().sleep(1000);
				System.out.println("Thread "+this.getNome()+" : Count N."+ i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		
	}


	@Override
	public void run() {
		conta();
	}
	
	
	
	
	
	
	
	
}