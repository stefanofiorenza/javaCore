package course.jse.common.model;

import lombok.Data;

@Data
public class Employee implements Comparable<Employee>{
		
	private String name;
	private double salary;
	private Date hireDate;
	

	public Employee (String name, double salary, Date hireDate) {
		setName(name);
		setSalary(salary);
		setHireDate(hireDate);
	}
		
    
    public void increaseSalary (double ratio) {
    	this.setSalary(this.getSalary()*ratio/100 + this.getSalary());    	
    }

	


	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

}
