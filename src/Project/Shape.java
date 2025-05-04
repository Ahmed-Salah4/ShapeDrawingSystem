package Project;

import java.util.Date;

public abstract class Shape implements Drawable {
	protected Date dateCreated = new Date();
	protected String color;

	public Shape() {
		color ="Blue";
	}

	public Shape(String color) {
		this.color = color;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	public String getColor()
	{
		return color;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
	
	
	@Override
	public String howToDraw() {
		return "How to Draw a Shape";
	}
	
	public abstract String getName();

}
