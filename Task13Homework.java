import java.util.Scanner;

public class Task13Homework {

	public static void main(String[] args) {
		// Задача 13:
		// Да се състави програма, която да отгатне колко е студено/топло по
		// въведената температура t в градус Целзий.
		// Температурните интервали са:
		// под -20 ледено студено;
		// между 0 и -20 - студено;
		// между 15 и 0 - хладно;
		// между 25 и 15 - топло;
		// над 25 – горещо.
		// Входни данни: цяло число от интервала [-100..100].
		// Пример: 12
		// Изход: хладно

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
