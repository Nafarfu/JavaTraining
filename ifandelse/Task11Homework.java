import java.util.Scanner;

public class Task11Homework {

	public static void main(String[] args) {
		// Задача 11:
		// Съставете програма, която по дадено трицифренo число проверява
		// дали числото се дели на всяка своя цифра. Във въведеното число да
		// няма цифра 0.

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Type in a 3 digit number to find if it can be devided by each of its digits. Make sure you don't type any 0 in it");

		int number = sc.nextInt();

		if (number < 111) {

			System.out.println("The number has to be at least 111!");

		} else if (number > 999) {

			System.out.println("The number must not exceed 999!");

		} else {
			if (number % 10 == 0 || ((number / 10) % 10) == 0 || number / 100 == 0) {

				System.out.println("Unfortunately, the number has a zero in it.");

			} else {
				int lastDivider = number % 10;
				int middleDivider = ((number / 10) % 10);
				int firstDevider = number / 100;

				if (number % lastDivider == 0 && number % middleDivider == 0 && number % firstDevider == 0) {

					System.out.println("The number can be divided by each of its digits");

				} else {
					System.out.println("The number cannot be divided by each of the digits");
				}
			}
		}

	}

}
