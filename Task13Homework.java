import java.util.Scanner;

public class Task13Homework {

	public static void main(String[] args) {
		// ������ 13:
		// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
		// ���������� ����������� t � ������ ������.
		// �������������� ��������� ��:
		// ��� -20 ������ �������;
		// ����� 0 � -20 - �������;
		// ����� 15 � 0 - ������;
		// ����� 25 � 15 - �����;
		// ��� 25 � ������.
		// ������ �����: ���� ����� �� ��������� [-100..100].
		// ������: 12
		// �����: ������

		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in a number between -100 to 100 to find how the temperature feels: ");

		int temperature = sc.nextInt();

		if (temperature < -100) {

			System.out.println("Well.. unftotunately everything is frozen and any kind of jacket won't save you");

		} else if (temperature > 100) {

			System.out.println("The ocean seems to be boiling.. You should probably wear a hat...");
		} else {
			if (temperature < -20) {

				System.out.println("It's freezing!");

			} else if (temperature >= -20 && temperature <= 0) {

				System.out.println("It's cold!");

			} else if (temperature > 0 && temperature <= 15) {

				System.out.println("It's cool!");

			} else if (temperature > 15 && temperature <= 25) {

				System.out.println("It's warm!");
			} else {
				System.out.println("It's hot!");
			}
		}

	}

}
