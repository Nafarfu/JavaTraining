import java.util.Scanner;

public class Task14Homework {

	public static void main(String[] args) {
		// Задача 14:
		// Да се състави програма, която по въведени координати на 2 позиции
		// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
		// различен цвят.
		// Шахматната дъска е квадратна.
		// Въвеждат се две двойки числа от интервала [1..8].
		// Пример: 2 2 3 2
		// Изход: Позициите са с различен цвят

		System.out.println("Enter the first coodinates from 1 to 8");
		Scanner sc = new Scanner(System.in);
		int firstPositionAside = sc.nextInt();
		int firstPositionBside = sc.nextInt();
		System.out.println("Enter the second coordinates from 1 to 8");
		int secondPositionAside = sc.nextInt();
		int secondPositionBside = sc.nextInt();

		if ((firstPositionAside < 1 || firstPositionAside > 8) || (firstPositionBside < 1 || firstPositionBside > 8)
				|| (secondPositionAside < 1 || secondPositionAside > 8)
				|| (secondPositionBside < 1 || secondPositionBside > 8)) {

			System.out.println("Invalid data");

		} else {
			int positionOne = firstPositionAside + firstPositionBside;

			if ((firstPositionAside + firstPositionBside) % 2 == 0) {
				positionOne = 1;
			} else {
				positionOne = 2;
			}
			int positionTwo = secondPositionAside + secondPositionBside;
			if ((secondPositionAside + secondPositionBside) % 2 == 0) {
				positionTwo = 1;
			} else {
				positionTwo = 2;
			}

			if (positionOne == positionTwo) {
				System.out.println("The positions are the same colour");
			} else {
				System.out.println("The positions are with a different colour");
			}
		}

	}

}
