package variables;

import java.util.Scanner;

public class DoesItDivideTo7 {
	
	public static void main(String[] args) {
		
//		Create a program that checks if you can divide a number with 7
//		has to return true or false. 
		
		System.out.println("Type in a number to check if it can be divided by 7");
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		boolean divider = false;
		
		if (number % 7 == 0) {
			
			divider = true;
			
			System.out.println(divider + ", the number can be divided with 7");
			
		}else {
			
			System.out.println(divider + ", the number cannot be divided with 7");
			
		}
		
	}
}
