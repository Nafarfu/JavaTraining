import java.util.Scanner;

public class Task06Homework {

	public static void main(String[] args) {
		// ������ 6:
		// �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		// �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		// �3 �� ��� ������� �������� �� �1.

		Scanner sc = new Scanner(System.in);

		System.out.println("Type in 3 numbers. The value of the first number will become the value of the second,"
				+ "the value of the second of second will become the value of the third and the value of the third"
				+ "will become the value of the first number. Now type in your first number: ");

		double firstNumber = sc.nextDouble();

		System.out.println("Type in the value of the second number: ");

		double secondNumber = sc.nextDouble();

		System.out.println("Type in the value of the third number:");

		double thirdNumber = sc.nextDouble();

		double tempNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		thirdNumber = tempNumber;

		System.out.println("The value of the first number is " + firstNumber + " the value of the second number is "
				+ secondNumber + " the value of the third number is: " + thirdNumber);

	}

}
