import java.util.Scanner;

public class Task02Homework {

	public static void main(String[] args) {
		// Задача 2:
		// Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
		// разлика, произведение, остатък от деление и целочислено деление в
		// отделни променливи и разпечатайте тези резултати в конзолата.
		// Опитайте същото с числа с плаваща запетая.

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Type in your first number");
		 * 
		 * int firstNumber = sc.nextInt();
		 * 
		 * System.out.println("Type in your second Number");
		 * 
		 * int secondNumber = sc.nextInt();
		 * 
		 * System.out.println("The addition of the two numbers is: " +
		 * (firstNumber + secondNumber)); System.out.println(
		 * "The subtraction of the two numbers is: " + (firstNumber -
		 * secondNumber)); System.out.println(
		 * "The multiplication of the two numbers is: " + (firstNumber *
		 * secondNumber)); System.out.println(
		 * "The addition of the two numbers is: " + (firstNumber /
		 * secondNumber)); System.out.println(
		 * "The remainder of the two numbers is: " + (firstNumber %
		 * secondNumber));
		 */

		// Not sure if that's how they are called.

		System.out.println("Type in your first number");

		double firstDoubleNumber = sc.nextDouble();

		System.out.println("Type in your second Number");

		double secondDoubleNumber = sc.nextDouble();

		System.out.println("The addition of the two numbers is: " + (firstDoubleNumber + secondDoubleNumber));
		System.out.println("The subtraction of the two numbers is: " + (firstDoubleNumber - secondDoubleNumber));
		System.out.println("The multiplication of the two numbers is: " + (firstDoubleNumber * secondDoubleNumber));
		System.out.println("The addition of the two numbers is: " + (firstDoubleNumber / secondDoubleNumber));
		System.out.println("The remainder of the two numbers is: " + (firstDoubleNumber % secondDoubleNumber));

	}

}
