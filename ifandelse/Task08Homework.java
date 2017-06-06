import java.util.Scanner;

public class Task08Homework {

	public static void main(String[] args) {
		// Задача 8:
		// Да се състави програма, която чете от конзолата 4-цифренo
		// естествено число от интервала [1000.. 9999]. От това число се
		// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
		// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
		// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
		// ново число e по-малко <, равно = или по-голямо от 2-то число.

		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in a 4 digit number between 1000 and 9999");

		int defaultNumber = sc.nextInt();

		if (defaultNumber < 1000) {

			defaultNumber = 1000;
		} else if (defaultNumber > 9999) {

			defaultNumber = 9999;

		}

		int firstNumber = (defaultNumber % 10) + (10 * (defaultNumber / 1000));

		int secondNumber = ((defaultNumber % 100) / 10) + (((defaultNumber / 100) % 10) * 10);

		if (firstNumber > secondNumber) {

			System.out.println("The first number " + firstNumber + " is larger than the second number " + secondNumber);
		} else if (firstNumber == secondNumber) {
			System.out.println("The first number " + firstNumber + " is equal to the second number " + secondNumber);
		} else {
			System.out.println("The first number " + firstNumber + " is smaller than the second number " + secondNumber);
		}

	}

}
