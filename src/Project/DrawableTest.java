package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DrawableTest {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<>();

		String fileName = "input.txt";
		File file = new File(fileName);
		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				input.add(scanner.next());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		File OutFile = new File("output.txt");

		try {
			ArrayList<Drawable> shapes = new ArrayList<>();
			PrintWriter writer = new PrintWriter(new FileWriter(OutFile));
			int NumberOfShapes;
			
			if (input.get(0).contains(".")) {
				writer.println("Please enter an integer value.");
				writer.close();
				return;
			} else
				NumberOfShapes = Integer.parseInt(input.get(0));
			
			if (NumberOfShapes < 2) {
				writer.println("Number of Shapes Should Be More than 2");
				writer.close();
				return;
			} else if ((input.size() - 1) / 2 != NumberOfShapes) {
				writer.println("First number Should be equal to number of shapes");
				writer.close();
				return;
			}

			for (int i = 1; i < input.size(); i += 2) {
				String shapeType = input.get(i);
				double value = Double.parseDouble(input.get(i + 1));

				if (value <= 0) {
					writer.println("Please Enter a Positive Value");
					writer.close();
					return;
				}

				if (shapeType.equalsIgnoreCase("Circle")) {
					shapes.add(new Circle(value));
				} else if (shapeType.equalsIgnoreCase("Cube")) {
					shapes.add(new Cube(value));
				} else {
					writer.println("Please Enter a Valid Shape");
					writer.close();
					return;
				}
			}

			double area = 0;
			for (int i = 0; i < shapes.size(); i++) {
				area += ((Shape) shapes.get(i)).getArea();
			}

			writer.println("The total area of the shapes Equals: " + area);
			writer.close();
			

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
