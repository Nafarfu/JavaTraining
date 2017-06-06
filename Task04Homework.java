import java.util.Scanner;

public class Task04Homework {

	public static void main(String[] args) {
		// Задача 4:
		// Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ
		// ред.

		Scanner sc = new Scanner(System.in);

		System.out.println("Type in two number and receive the result in ascending order. Type in the first number: ");

		double firstNumber = sc.nextDouble();

		System.out.println("Type in the second number: ");

		double secondNumber = sc.nextDouble();

		if (secondNumber < firstNumber) {

			double tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;

		} else if (firstNumber == secondNumber) {

			System.out.println("The value of the first number is equal to the value of the second");

		}

		System.out.println("The value of the numbers in ascending order is: " + firstNumber + ", " + secondNumber);

	}

}
