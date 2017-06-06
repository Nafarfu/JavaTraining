import java.util.Scanner;

public class Task15Homework {

	public static void main(String[] args) {
		// �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		//[0..24].
		//���������� �� ������ ������������� ��������� ��������� ���������
		//���.
		//��������� ��:
		//[18..4] - ����� �����;
		//[4..9] - ����� ����;
		//[9..18] - ����� ���
		//������: 10
		//�����: ����� ���
		
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
