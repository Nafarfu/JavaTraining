import java.util.Scanner;

public class Task03Homework {

	public static void main(String[] args) {

		// ������ 3:
		// �������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
		// ������������ ������ ���������

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
