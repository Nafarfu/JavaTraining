import java.util.Scanner;

public class Task01Homework {

	public static void main(String[] args) {
		// ������ 1:
		// �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
		// ������������ A � B (���� �� �� � ������� ������� � double).
		// ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
		// �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in your fist number");

		double firstNumber = sc.nextDouble();

		System.out.println("Please type in the second number");

		double secondNumber = sc.nextDouble();

		System.out.println("Type in the third number, in order to find if it is located between the first two numbers");

		double isItBetweenNumber = sc.nextDouble();

		if (isItBetweenNumber > firstNumber && isItBetweenNumber < secondNumber) {
			System.out.println("Congratulations! The number is between the first two numbers.");
		} else if (isItBetweenNumber > secondNumber && isItBetweenNumber < firstNumber) {
			System.out.println("Congratulations! The number is between the first two numbers.");
		} else {
			System.out.println("Unfortunately, your number isn't between the first two numbers.");
		}

	}

}
