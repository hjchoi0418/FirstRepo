package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C08_FiveDice {

	/*
	 * �������� 5���� �ֻ����� ���� ������ ����� ���� ������ �����ϴ� Ŭ������ ��������.
	 * 
	 * 1. Ǯ�Ͽ콺 (���� ���� 2�� + 3��) (11666 / 22333 / ...) 2. ���� ��Ʈ����Ʈ (1234 / 2345 /
	 * 3456) 3. ���� ��Ʈ����Ʈ (12345 / 23456) 4. 4 ���̽� (���� ���� 4��) 5. 5 ���̽� (���� ���� 5��)
	 * 
	 * �� ���ӱ��� �����ϰ� ������ ���� Yacht Dice�� �˻��غ�����.
	 * 
	 * # �޼���
	 * 
	 * (1) ��� �ֻ����� ������ �޼���
	 * 
	 * (2) ���ϴ� �ֻ����� �����ϰ� �������� ������ �޼��� (2�� ���� ����)
	 * 
	 * (3) �ֻ����� ���� ���� ������ ���� 1,2,3,4,5 �� �ش��ϴ� ���� �ִ��� üũ�ϴ� �޼���
	 */

	int[] dices = new int[5];
	int rollCount;

	public C08_FiveDice() {
		rollCount = 2;
	}

	void rollAll() {
		System.out.println("�ֻ����� ��� �����ϴ�.");
		for (int i = 0; i < dices.length; i++)
			dices[i] = (int) (Math.random() * 6) + 1;
		Arrays.sort(dices, 0, 5);
		rollCount = 2;
		check();
	}

	void rollSelect(int num) {
		if (rollCount <= 0)
			System.out.println("�ֻ����� �� �̻� �����ؼ� ���� �� �����ϴ�.");
		else {
			System.out.print(num + "��° �ֻ����� ������ ��� �ֻ����� �����ϴ�. ");
			for (int i = 0; i < dices.length; i++) {
				if (i != num - 1)
					dices[i] = (int) (Math.random() * 6) + 1;
			}
			Arrays.sort(dices, 0, 5);
			rollCount--;
			System.out.printf("(���� Ƚ�� : %d)", rollCount);
			System.out.println();
			check();
		}
	}

	void check() {
		Arrays.sort(dices, 0, 5);
		System.out.println("���� �ֻ��� : " + Arrays.toString(dices));
		if (dices[0] == dices[4])
			System.out.println("5 ���̽�!!");
		else if (dices[0] == dices[3] || dices[1] == dices[4])
			System.out.println("4 ���̽�!!");
		else if (dices[0] + 1 == dices[1] && dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3]
				&& dices[3] + 1 == dices[4])
			System.out.println("���� ��Ʈ����Ʈ!!");
		else if ((dices[0] + 1 == dices[1] && dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3])
				|| (dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3] && dices[3] + 1 == dices[4]))
			System.out.println("���� ��Ʈ����Ʈ!!");
		else if ((dices[0] == dices[1] && dices[2] == dices[4]) || (dices[0] == dices[2] && dices[3] == dices[4]))
			System.out.println("Ǯ�Ͽ콺!!");
		System.out.println();
	}

	public static void main(String[] args) {
		C08_FiveDice d1 = new C08_FiveDice();
		Scanner sc = new Scanner(System.in);
		int input;

		d1.rollAll();
		while (true) {
			System.out.println("(1) ��� �ֻ��� ������, (2) ������ �ֻ����� �����ϰ� ������, (3) ���� �ֻ��� Ȯ��");
			input = sc.nextInt();
			switch (input) {
			case 1:
				d1.rollAll();
				break;
			case 2:
				System.out.print("������ �ֻ��� ��ȣ (1 ~ 5) >> ");
				input = sc.nextInt();
				d1.rollSelect(input);
				break;
			case 3:
				d1.check();
				break;
			default:
				break;
			}
		}
	}
}
