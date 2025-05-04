package Project;

public abstract class ThreeDShape extends Shape {

	public ThreeDShape() {
		super();
	}

	public ThreeDShape(String color) {
		super(color);
	}

	public abstract double getVolume();

	@Override
	public String howToDraw() {
		return "How to Draw a Shape";
	}

}
