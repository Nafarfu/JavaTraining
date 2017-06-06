import java.util.Scanner;

public class Task10Homework {

	public static void main(String[] args) {
		// ������ 10:
		// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
		// 3 ����� � �� �������� ������������.
		// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
		// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
		// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
		// ������ �����: ���������� ����� �� ��������� [10..9999].
		// ������: 107
		// �����: 21 ���� �� 2 �����,
		// 21 ���� �� 3 �����
		// ������������ ���� �� 2 �����

		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in the amount of water(in liters) that you wish to use to fill in a cistern."
				+ " The amount of water that you can use can be between 10 and 9999");

		int amountOfWater = sc.nextInt();

		if (amountOfWater < 10) {
			amountOfWater = 10;
		} else if (amountOfWater > 9999) {
			amountOfWater = 9999;
		}

		int bucketUsage = amountOfWater / 5;

		int extraBucket = amountOfWater % 5;

		if (extraBucket == 0 || extraBucket == 1) {
			System.out.println(bucketUsage + " turns of 2 liter bucket and " + bucketUsage
					+ " turns of 3 liters bucket and no extra buckets were used");
		} else if (extraBucket == 2) {
			System.out.println(bucketUsage + " turns of 2 liter bucket and " + bucketUsage
					+ " turns of 3 liters bucket and" + " an extra 2 liter bucket was used");
		} else if (extraBucket == 3 || extraBucket == 4) {
			System.out.println(bucketUsage + " turns of 2 liter bucket and " + bucketUsage
					+ " turns of 3 liters bucket and" + " an extra 3 liter bucket was used");
		}

	}

}
