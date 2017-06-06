import java.util.Scanner;

public class Task05Homework {

	public static void main(String[] args) {
		// Задача 5:
		// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		// ред.

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Type in the value of 3 numbers and receive result in descending order. Type in the first number: ");

		double firstNumber = sc.nextDouble();

		System.out.println("Type in the second number: ");

		double secondNumber = sc.nextDouble();

		System.out.println("Type in the third number: ");

		double thirdNumber = sc.nextDouble();

		double tempNumber = firstNumber;

		if (firstNumber < secondNumber) {

			tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;

		}
		if (firstNumber < thirdNumber) {

			tempNumber = firstNumber;
			firstNumber = thirdNumber;
			thirdNumber = tempNumber;

		}
		if (secondNumber < thirdNumber) {

			tempNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = tempNumber;

		}

		System.out.println(
				"The numbers in descending order are: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);

	}

}
