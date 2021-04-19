package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	/*
	 	# 31 ������ ����� ������
	 	
	 	1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
	 		(1, 2, 3 �ۿ� ������ �� ����)
	 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	 	3. ������ �������� �����Ѵ�
	 	4. �������� 31 �̻��� ���ڸ� ���� �� �ۿ� ���� �÷��̾ �й��Ѵ�.
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		final boolean PLAYER = true, COMPUTER = false;
		
		boolean turn;
		int cnt = 0;
		int input;
		
		System.out.println("#### 31 ���� ####");
		turn = rand.nextBoolean() ? true : false;
		if (turn == PLAYER)
			System.out.println("�÷��̾��� �����Դϴ�.");
		else
			System.out.println("��ǻ���� �����Դϴ�.");
		
		while (true) {
			if (turn == PLAYER) {
				System.out.println("����� �����Դϴ�. ");
				System.out.print("(1, 2, 3) �� ���� �Է� >> ");
				
				while (true) {
					input = sc.nextInt();
					if (input == 1 || input == 2 || input == 3) break;
					else System.out.print("���� (1, 2, 3) �� �ϳ��� ���� >> ");
				}
				
				for (int j = 0; j < input; j++) {
					cnt += 1;
					System.out.print(cnt + " ");
					if (cnt >= 31) break;
				}
				System.out.println();
				turn = COMPUTER;
			} else {
				System.out.println("��ǻ���� �����Դϴ�. ");
				
				if (cnt + 2 == 31)
					input = 1;
				else if (cnt + 3 == 31)
					input = 2;
				else if (cnt + 4 == 31)
					input = 3;
				else
					input = rand.nextInt(3) + 1;
				
				for (int j = 0; j < input; j++) {
					cnt += 1;
					System.out.print(cnt + " ");
					if (cnt >= 31) break;
				}
				System.out.println();
				turn = PLAYER;
			}
			if (cnt >= 31) break;
		}
		System.out.println(turn == PLAYER ? "�¸�!" : "�й�!");
	}
}