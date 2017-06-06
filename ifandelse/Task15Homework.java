import java.util.Scanner;

public class Task15Homework {

	public static void main(String[] args) {
		// Да се състави програма, която въвежда естествено число от интервала
		//[0..24].
		//Програмата да изведе съответстващо съобщение съобразно въведения
		//час.
		//Периодите са:
		//[18..4] - Добър вечер;
		//[4..9] - Добро утро;
		//[9..18] - Добър ден
		//Пример: 10
		//Изход: Добър ден
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What would be the proper greeting? Type in an hour of the day between 0 and 24");
		
		int hour = sc.nextInt();
		
		if (hour < 0) {
			
			hour = 0;
			
		}else if (hour > 24) {
			
			hour = 24;
			
		}
		
		if (hour >= 18 || hour < 4) {
			
			System.out.println("Good Evening!");
			
		}else if (hour >= 4 || hour < 9) {
			
			System.out.println("Good Morning!");
			
		}else{
			
			System.out.println("Good day!");
		}


	}

}
