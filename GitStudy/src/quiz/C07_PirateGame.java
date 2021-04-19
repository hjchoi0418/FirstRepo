package quiz;

import java.util.Random;
import java.util.Scanner;

public class C07_PirateGame {
	
	/*
	 	1. �÷��̾ ���ư��鼭 ���ϴ� ���� Į�� ���.
	 
	 	2. �߸��� ���� Į�� ������ ���� �������� ���ư��� ���ӿ� �й��Ѵ�.
	*/

	public static void main(String[] args) {
		final boolean PLAYER = true, COMPUTER = false;

		int input;
		int size = 10;
		boolean turn;

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Barrel barrel = new Barrel(size);

		turn = rand.nextBoolean() ? true : false;
		
		while (true) {
			if (barrel.gameover == true)
				break;

			barrel.rest();

			if (turn == PLAYER) {
				System.out.println("�÷��̾��� �����Դϴ�.");
				while (true) {
					System.out.printf("� ���� ��ȣ �Է� (0 ~ %d) >> ", barrel.hole.length - 1);
					input = sc.nextInt();
					if (input < 0 || input >= barrel.hole.length)
						System.out.println("���� ���� ���Դϴ�.");
					else if (barrel.hole[input] == -1)
						System.out.println("�ߺ��� ���Դϴ�.");
					else
						break;
				}

				barrel.stab(input);

				turn = COMPUTER;
			} else {
				System.out.print("��ǻ���� �����Դϴ�. ");
				while (true) {
					input = (int) (Math.random() * barrel.hole.length);
					if (barrel.hole[input] != -1)
						break;
				}

				System.out.printf("��ǻ���� ���ڴ� %d\n", input);
				barrel.stab(input);

				turn = PLAYER;
			}
		}
		System.out.print("��������� ���ư��ϴ�. ");
		if (turn == PLAYER) {
			System.out.println("�÷��̾� �¸�!");
		} else
			System.out.println("�÷��̾� �й�!");
	}
}

class Barrel {
	Random ran;
	boolean gameover;

	int[] hole;

	public Barrel(int size) {
		ran = new Random();

		hole = new int[size];
		hole[ran.nextInt(size)] = 1;
	}

	void rest() {
		System.out.println("------------------------------");
		System.out.print("���� ���� : ");
		for (int i = 0; i < hole.length; i++) {
			if (hole[i] >= 0)
				System.out.print(i + " ");
		}
		System.out.println("\n------------------------------");
	}

	void stab(int num) {
		if (hole[num] == 1) {
			gameover = true;
		} else if (hole[num] == -1) {
			System.out.println("�ߺ��� ���Դϴ�.");
		} else {
			hole[num] = -1;
		}
	}
}