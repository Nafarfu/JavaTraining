import java.util.Scanner;

public class Task07Homework {

	public static void main(String[] args) {
		// Задача 7:
		// Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
		// пари (число с плаваща запетая), дали съм здрав – булев тип.
		// Съставете програма, която взема решения на базата на тези данни по
		// следния начин:
		// - ако съм болен, няма да излизам
		// - ако имам пари, ще си купя лекарства
		// - ако нямам – ще стоя вкъщи и ще пия чай
		// - ако съм здрав, ще отида на кино с приятели
		// - ако имам по-малко от 10 лв, ще отида на кафе.
		// Полученото решение покажете като съобщение в конзолата.

		Scanner sc = new Scanner(System.in);

		System.out.println("Am I going out? Type in an hour of the day: ");

		int hour = sc.nextInt();
		boolean hourValidator = true;

		while (hourValidator) {

			if (hour < 0 || hour > 24) {
				System.out.println("Please type in an hour between 0 and 24");
				hour = sc.nextInt();
			} else {
				hourValidator = false;
			}

		}

		System.out.println("How much money do I have?");
		double money = sc.nextDouble();

		if (money < 0) {

			money = 0;
		}
		System.out.println("Am I healthy? Type in true or false.");
		boolean amIHealthy = sc.nextBoolean();

		if (amIHealthy == false) {

			System.out.println("I'm not going out, because I'm sick.");
			if (money > 0) {
				System.out.println("I'll buy some drugs and hopefully this would help.");

			} else {
				System.out.println(
						"I don't even have money to buy medecine... I'll just stay at home and drink some tea...");
			}

		} else {
			System.out.println("I feel great! I'm thinking about going to see a movie with some friends!");

			if (money < 10) {

				System.out.println("However, I'm a bit short on cash... coffee sounds like a better idea...");
			}

		}

	}

}
