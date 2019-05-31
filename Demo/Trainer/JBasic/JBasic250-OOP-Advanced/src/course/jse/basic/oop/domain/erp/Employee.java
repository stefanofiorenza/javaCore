package course.jse.basic.oop.domain.erp;

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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
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
