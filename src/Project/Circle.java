package Project;

public class Circle extends Shape {
	private double radius;

	public Circle(double raduis) {
		super();
		this.radius = raduis;
	}

	public Circle(String color, double raduis) {
		super(color);
		this.radius = raduis;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double getArea() {

		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {

		return 2 * radius * Math.PI;
	}

	@Override
	public String howToDraw() {
		return "Draw a circle with radius " + radius;
	}

	public String toString() {
		return "A Circle with Radius: " + radius + " and Color: " + color;
	}
	
	@Override
	
	public String getName()
	{
		return "Circle";
	}

}
