import java.util.Scanner;

public class Task16Homework {

	public static void main(String[] args) {
		// ������ 16:
		// �������� � ���������� ���������� ����� �� ���� abc.
		// ������ �� �� ������� ����:
		// ��� a = b = c - �����: ������� �� �����;
		// ��� a>b>c - �����: ������� �� ��� �������� ���;
		// ��� a<b<c ������� �� � �������� ���;
		// � �����: ������� �� ����������, �� ����������� ������.
		// �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
		// ������� �� ������� � �������.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in a 3 digit number to find if the digts are equal, in ascending order, descending order or random."
				+ " The number should be between 100 and 999");
		
		int number = sc.nextInt();
		
		if (number < 100) {
			
			System.out.println("The number is too small");
			
		}else if (number > 999) {
			
			System.out.println("The number is too large");
			
		}else{
			
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			
			if (firstDigit == secondDigit && secondDigit == thirdDigit) {
				
				System.out.println("The numbers are equal");
				System.out.println(firstDigit + " = " + secondDigit + " = " + thirdDigit);
			}else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
				
				System.out.println("The numbers are in descending order");
				System.out.println(firstDigit + " > " + secondDigit + " > " + thirdDigit);
				
			}else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
				
				System.out.println("The numbers are in ascending order");
				System.out.println(firstDigit + " < " + secondDigit + " < " + thirdDigit);
				
			}else {
				System.out.println("the number are in random order");
			}
		
		}


	}

}
