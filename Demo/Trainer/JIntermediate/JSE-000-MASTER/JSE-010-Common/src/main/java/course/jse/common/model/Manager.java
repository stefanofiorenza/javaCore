package course.jse.common.model;

import lombok.Getter;
import lombok.Setter;

public class Manager extends Employee {
	
  
   private static final double BONUS=0.02;
 
   @Getter
   @Setter
   private int managedProjects;
      
	public Manager(String name, double salary, Date hireDate,int projects) {
		super(name, salary, hireDate);
		setManagedProjects(projects);
	}


	public void increaseSalary(double ratio) {
		double managerRatio = this.getManagedProjects()*BONUS+ratio;
		super.increaseSalary(managerRatio);	
	}



}
