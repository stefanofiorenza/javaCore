package course.jse.basic.oop.domain;

public class Manager extends Employee {
	
   private int managedProjects;
   private static final double BONUS=0.02;
 
      
	public Manager(String name, double salary, Date hireDate,int projects) {
		super(name, salary, hireDate);
		setManagedProjects(projects);
	}


	public int getManagedProjects() {
		return managedProjects;
	}
	
	
	public void setManagedProjects(int managedProjects) {
		this.managedProjects = managedProjects;
	}



	public void increaseSalary(double ratio) {
		double managerRatio = this.getManagedProjects()*BONUS+ratio;
		super.increaseSalary(managerRatio);	
	}



}
