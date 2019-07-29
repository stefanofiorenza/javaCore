package course.java.jse.threads.sun.jdk5.tut02.concurrent.executors;

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
		while (i<20){
			
			i++;
			try {
				Thread.currentThread().sleep(200);
				System.out.println("sono il thread "+this.getNome()+" : conta N."+ i);
				
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