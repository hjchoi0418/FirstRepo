package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	/*
	 	# 31 게임을 만들어 보세요
	 	
	 	1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.
	 		(1, 2, 3 밖에 선택할 수 없음)
	 	2. 컴퓨터는 랜덤으로 숫자를 선택한다
	 	3. 선공은 랜덤으로 결정한다
	 	4. 마지막에 31 이상의 숫자를 만들 수 밖에 없는 플레이어가 패배한다.
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		final boolean PLAYER = true, COMPUTER = false;
		
		boolean turn;
		int cnt = 0;
		int input;
		
		System.out.println("#### 31 게임 ####");
		turn = rand.nextBoolean() ? true : false;
		if (turn == PLAYER)
			System.out.println("플레이어의 선공입니다.");
		else
			System.out.println("컴퓨터의 선공입니다.");
		
		while (true) {
			if (turn == PLAYER) {
				System.out.println("당신의 차례입니다. ");
				System.out.print("(1, 2, 3) 중 숫자 입력 >> ");
				
				while (true) {
					input = sc.nextInt();
					if (input == 1 || input == 2 || input == 3) break;
					else System.out.print("숫자 (1, 2, 3) 중 하나만 선택 >> ");
				}
				
				for (int j = 0; j < input; j++) {
					cnt += 1;
					System.out.print(cnt + " ");
					if (cnt >= 31) break;
				}
				System.out.println();
				turn = COMPUTER;
			} else {
				System.out.println("컴퓨터의 차례입니다. ");
				
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
		System.out.println(turn == PLAYER ? "승리!" : "패배!");
	}
}