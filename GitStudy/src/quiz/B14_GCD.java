package quiz;

import java.util.Scanner;

public class B14_GCD {

	/*
	 	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����.
	 	
	 	�ִ����� : �� ������ ����� �� ���� ū �����
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ΰ� �Է� >> ");

		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		if (input2 > input1) {
			int tmp;
			tmp = input1;
			input1 = input2;
			input2 = tmp;
		}

		for (int i = input2; i > 0; i--) {
			if (input2 % i != 0) {
				continue;
			}
			if (input1 % i == 0) {
				System.out.println("�ִ������� " + i);
				break;
			}
		}
	}
}
