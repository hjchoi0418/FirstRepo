package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		
		/*
		 	����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		 	
		 	����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		 	����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷���
		 	��������.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ� ����� ������ �Է��ϼ���(��) > ");
		int apple = sc.nextInt();
		
		if (apple < 0)
			System.out.printf("��Ȯ�� ������ �Է����ּ���(������ �ƴ� ���� �Է����ּ���).");
		else {
			if (apple % 10 > 0)
				System.out.printf("�ʿ��� �ٱ����� ���� %d�� �Դϴ�.", (apple / 10) + 1);
			else
				System.out.printf("�ʿ��� �ٱ����� ���� %d�� �Դϴ�.", (apple / 10));
		}
	}
}