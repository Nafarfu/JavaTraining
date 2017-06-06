import java.util.Scanner;

public class Task09Homework {

	public static void main(String[] args) {
		// Задача 9:
		// Да се състави програма, която чете от конзолата 2 естествени
		// двуцифрени числа a,b.
		// Програмата да изведе в конзолата дали последната цифра от
		// произведението на двете числа е четна, както и самата цифра.
		// Входни данни: a,b - естествени числа от интервала [10..99].
		// Пример: 15, 25
		// Изход: 375, 5 нечетна

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Type in two numbers positive natural numbers between 10 and 99 to find the multiplication of the numbers and the"
						+ "last digit. Please type in the first one");

		int firstNumber = sc.nextInt();

		if (firstNumber < 10) {
			firstNumber = 10;
		} else if (firstNumber > 99) {
			firstNumber = 99;
		}

		System.out.println("Type in the second number:");

		int secondNumber = sc.nextInt();

		if (secondNumber < 10) {
			secondNumber = 10;
		} else if (secondNumber > 99) {
			secondNumber = 99;
		}

		int result = firstNumber * secondNumber;
		int lastDigit = result % 10;

		if (lastDigit % 2 == 0) {
			System.out.println(result + ", " + lastDigit + " even");
		} else {
			System.out.println(result + ", " + lastDigit + " odd");
		}

	}

}
