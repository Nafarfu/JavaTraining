package variables;

import java.util.Scanner;

public class triangleGenerator {

	public static void main(String[] args) {
		
		
		// Get 3 numbers from the user, check if it is possible to create a triangle with the given data
		// If a side is larger than the increment of the other two sides, return false. Must use &&
		
		
		System.out.println("Hello! Check if it's possible to create a triangle with a given sides." + 
											" Please type in the first side");
		
		Scanner scanner = new Scanner(System.in);
		
		double firstSide = scanner.nextDouble();
		
		System.out.println("Type in the second side ");
		
		double secondSide = scanner.nextDouble();
		
		System.out.println("Type in the third side ");
		
		double thirdSide = scanner.nextDouble();
		
		boolean triangleGenerator = false;
		
		if (firstSide < secondSide + thirdSide 
				&& secondSide < firstSide + thirdSide 
				&& thirdSide < firstSide + secondSide) {
			triangleGenerator = true;
			System.out.println(triangleGenerator + ", you can create a triangle with those sides");
			
		}else {
			
			System.out.println(triangleGenerator + ", you can't create such triangle.");
		}

	}

}
