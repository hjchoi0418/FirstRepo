package quiz;

import java.util.Random;
import java.util.Scanner;

public class C07_PirateGame {
	
	/*
	 	1. 플레이어가 돌아가면서 원하는 곳에 칼을 찌른다.
	 
	 	2. 잘못된 곳에 칼을 넣으면 해적 아저씨가 날아가며 게임에 패배한다.
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
				System.out.println("플레이어의 차례입니다.");
				while (true) {
					System.out.printf("찌를 구멍 번호 입력 (0 ~ %d) >> ", barrel.hole.length - 1);
					input = sc.nextInt();
					if (input < 0 || input >= barrel.hole.length)
						System.out.println("범위 밖의 값입니다.");
					else if (barrel.hole[input] == -1)
						System.out.println("중복된 값입니다.");
					else
						break;
				}

				barrel.stab(input);

				turn = COMPUTER;
			} else {
				System.out.print("컴퓨터의 차례입니다. ");
				while (true) {
					input = (int) (Math.random() * barrel.hole.length);
					if (barrel.hole[input] != -1)
						break;
				}

				System.out.printf("컴퓨터의 숫자는 %d\n", input);
				barrel.stab(input);

				turn = PLAYER;
			}
		}
		System.out.print("통아저씨가 날아갑니다. ");
		if (turn == PLAYER) {
			System.out.println("플레이어 승리!");
		} else
			System.out.println("플레이어 패배!");
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
		System.out.print("남은 구멍 : ");
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
			System.out.println("중복된 값입니다.");
		} else {
			hole[num] = -1;
		}
	}
}