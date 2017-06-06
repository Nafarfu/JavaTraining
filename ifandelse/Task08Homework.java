import java.util.Scanner;

public class Task08Homework {

	public static void main(String[] args) {
		// ������ 8:
		// �� �� ������� ��������, ����� ���� �� ��������� 4-������o
		// ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
		// �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
		// � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
		// 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
		// ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.

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
