package course.jse.basic.oop.domain.geometry;

public class Circle extends Shape{

	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}

}
