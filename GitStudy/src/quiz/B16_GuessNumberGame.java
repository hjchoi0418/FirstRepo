package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	/*
	 	게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다.
	 	
	 	1. 플레이어는 8번의 시도를 할 수 있다.
	 	
	 	2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
	 	
	 		숫자와 위치가 다 맞을 경우 - Strike
	 		숫자만 맞을 경우 - Ball
	 		
	 	ex : 정답이 3456일 때
	 	
	 		>> 5633		4Ball
	 		>> 3789		1 Strike
	 		>> 3654		1 Strike 3 Ball
	 		
	 	* 맞추고 나면 몇 번만에 맞췄는지 알려주기
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		StringBuilder answer = new StringBuilder();
		
		final int SIZE = 4;
		
		int cnt = 0, ball = 0, strike = 0;
		boolean win = false;
		String input;
		
		for (int i = 0; i < SIZE; ++i) {
			answer.append(rand.nextInt(10));
		}
		
		System.out.println("정답은 " + answer);
		
		while (cnt < 8) {
			cnt++;
			ball = 0; strike = 0;
			
			while (true) {
				System.out.print("4자리 숫자를 맞춰보세요 >> ");
				
				input = sc.next();
				
				if (input.length() != 4) continue;
				
				boolean numeric = true;
				
				for (int i = 0; i < SIZE; i++) {
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						numeric = false;
						break;
					}
				}
				
				if (numeric) break;
				else System.out.println("4자리 숫자만 입력하셔야 합니다.");
			}
			
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < input.length(); ++j) {
					if (answer.charAt(i) == input.charAt(j)) {
						ball++;
						break;
					}
				}
			}
			
			for (int i = 0; i < SIZE; i++) {
				if (answer.charAt(i) == input.charAt(i))
					strike++;
			}
			
			ball = ball - strike;
			
			if (strike == SIZE) {
				win = true;
				break;
			}
			
			if (strike > 0)
				System.out.print(strike + " Strike ");
			if (ball > 0)
				System.out.print(ball + " Ball ");
			System.out.println();
		}
		
		if (win == true) {
			System.out.println("정답! " + cnt + "번 만에 맞추셨습니다.");
		} else {
			System.out.println("실패! 정답은 " + answer + " 였습니다.");
		}
	}
}