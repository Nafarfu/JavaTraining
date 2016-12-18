package variables;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		// Find the area of a Rectangle.
		
		System.out.println("Please type in the first side of the rectangle");
		Scanner sc = new Scanner(System.in);
		
		double firstSide = sc.nextDouble();
		
		System.out.println("Please type in the second side of the rectangle");
		
		double secondSide = sc.nextDouble();
		
		double rectangleArea = firstSide * secondSide;
		
		System.out.println("The area of the Rectangle is " + rectangleArea);

	}

}
