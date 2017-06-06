import java.util.Scanner;

public class Task10Homework {

	public static void main(String[] args) {
		// Задача 10:
		// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
		// 3 литра и ги ползвате едновременно.
		// Да се състави програма, която по даден обем извежда как ще прелеете
		// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
		// кофите. Кофите не могат да се ползват с частично количество вода.
		// Входни данни: естествено число от интервала [10..9999].
		// Пример: 107
		// Изход: 21 пъти по 2 литра,
		// 21 пъти по 3 литра
		// допълнително кофа от 2 литра

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
