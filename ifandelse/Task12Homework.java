import java.util.Scanner;

public class Task12Homework {

	public static void main(String[] args) {
		// Задача 12:
		// Високосни години са всички години кратни на 4 с изключения
		// столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
		// но 1600 и 2000 са високосни.
		// Съставете програма, която по дадени ден, месец, година отпечатва
		// следващата дата.
		// Входни данни: три числа за ден, месец, година.
		// Пример: 28, 2, 2000
		// Изход: 1,3,2000

		boolean leapYear;

		System.out.println("Enter day");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		System.out.println("Enter month");
		int month = sc.nextInt();

		System.out.println("Enter year");
		int year = sc.nextInt();

		if ((year % 4 == 0) && (year % 400 == 0)) {
			leapYear = true;
		} else if ((year % 4 == 0) && year % 100 != 0) {
			leapYear = false;
		} else {
			leapYear = false;
		}
		if (month >= 13 || month < 1) {

			System.out.println(
					"you have exceeded the months of an year.You should choose between 1 and 12. The date won't be correct.");

		}

		if (month == 2 && leapYear == true) {
			if (day == 29) {
				day = 1;
				month += 1;
			} else if (day > 29) {

				System.out.println("you have exceeded the days of that month. The date won't be correct.");

			} else {
				day += 1;
			}
		} else if (month == 2 && leapYear == false) {
			if (day == 28) {
				day = 1;
				month += 1;
			} else if (day > 28) {

				System.out.println("you have exceeded the days of that month. The date won't be correct.");

			} else {
				day += 1;
			}
		}

		else if (month == 2 && day > 28 && leapYear == false) {

			System.out.println("you have exceeded the days of that month. The date won't be correct.");

		} else if (month == 2 && day > 29 && leapYear == true) {

			System.out.println("you have exceeded the days of that month. The date won't be correct.");

		}

		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day == 31) {
				day = 1;
				month += 1;
				if (month == 13) {
					month = 1;
					year += 1;
				}
			} else if (day > 31) {

				System.out.println("you have exceeded the days of that month. The date won't be correct.");

			} else {
				day += 1;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				day = 1;
				month += 1;
			} else if (day > 30) {

				System.out.println("you have exceeded the days of that month. The date won't be correct.");

			} else {
				day += 1;
			}
		}
		System.out.println(day + "," + month + "," + year);
	}

}
