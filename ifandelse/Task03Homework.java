import java.util.Scanner;

public class Task03Homework {

	public static void main(String[] args) {

		// Задача 3:
		// Въведете 2 различни числа от конзолата и разменете стойността им.
		// Разпечатайте новите стойности

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello! This is a tool that swaps two number. Please type in your first number:");

		double firstNumber = sc.nextDouble();

		System.out.println("Please type in your second number:");

		double secondNumber = sc.nextDouble();

		double tempNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempNumber;

		System.out.println("The new value of the first number is " + firstNumber
				+ " and the new value of the second number is " + secondNumber);

	}

}
