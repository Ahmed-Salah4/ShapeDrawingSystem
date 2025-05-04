package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DrawableTest {
	public static void main(String[] args) {
		int NumberOfShapes;
		if (args[0].contains(".")) {
			System.out.println("Please enter an integer value.");
			return;
		} else
			NumberOfShapes = Integer.parseInt(args[0]);

		if (args.length != (2 * NumberOfShapes + 1)) {
			System.out.println("Input size does not match the number of shapes \n");
			return;
		}
		if (NumberOfShapes < 2) {
			System.out.println("Number Of shapes should be 2 or more\n");
			return;
		}

		ArrayList<Drawable> shapes = new ArrayList<>();

		for (int i = 1; i < args.length; i += 2) {
			String shapeType = args[i];
			double value = Double.parseDouble(args[i + 1]);

			if (value <= 0) {
				System.out.println("Please Enter a Positive Value");
				return;
			}

			if (shapeType.equalsIgnoreCase("Circle")) {
				shapes.add(new Circle(value));
			} else if (shapeType.equalsIgnoreCase("Cube")) {
				shapes.add(new Cube(value));
			} else {
				System.out.println("Please Enter a Valid Shape");
				return;
			}
		}

		double area = 0;
		for (int i = 0; i < shapes.size(); i++) {
			area += ((Shape) shapes.get(i)).getArea();
		}

		System.out.println("The total area of the shapes Equals: " + area);

	}
}
