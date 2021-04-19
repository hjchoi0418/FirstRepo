package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
		/*
		 	�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����.
		 	
		 	* �ʿ���� ������ ������� ����
		 	* ex : 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
		 */
		Scanner sc = new Scanner(System.in);
		
		int year, day, hour, minute, second;
		System.out.print("�ʸ� �Է��ϼ���. >> ");
		second = sc.nextInt();
		
		year = second / 31536000;
		day = second / 86400;
		hour = second / 3600;
		minute = second / 60;
		
		if (year > 0)
			System.out.print(year + "�� ");
		if (day > 0)
			System.out.print(day % 365 + "�� ");
		if (hour > 0)
			System.out.print(hour % 24 + "�ð� ");
		if (minute > 0)
			System.out.print(minute % 60 + "�� ");
		if (second > 0)
			System.out.println(second % 60 + "�� ");
	}
	
}