package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		
		// ����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹����� �� �����
		// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �ظ� �Է��ϼ��� (������) > ");
		int bornYear = sc.nextInt();
		System.out.print("������ �⵵�� �Է��ϼ��� (������) > ");
		int year = sc.nextInt();
		
		System.out.println("���̴� " + (year - bornYear + 1) + "�� �Դϴ�.");
		
	}
}
