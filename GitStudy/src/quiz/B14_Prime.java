package quiz;

import java.util.Scanner;

public class B14_Prime {

	/*
	 * ����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	 * 
	 * 1�� �ڱ� �ڽ����θ� ������ �������� �� ex : 7, 11, 13, 17
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j;

		System.out.print("���� �Է� >> ");
		int input = sc.nextInt();

		for (int i = 2; i <= input; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j)
				System.out.println(i);
		}
	}
}