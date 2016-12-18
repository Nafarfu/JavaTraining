package variables;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		// Find the are of a circle.
		
		System.out.println("Hello! In order to find the area of the circle, please type in the raius of it:");
		
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		
		double circleArea = Math.PI * (radius * radius);
		
		System.out.println("The are of your circle is " + circleArea);

	}

}
