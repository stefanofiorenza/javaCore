package course.jse.basic.oop.domain.geometry;

public class Rectangle extends Shape{

	private double width ;
	private double height;
	
	
	
	
	
	@Override
	public double calculateArea() {
		return getWidth()*getHeight();
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
