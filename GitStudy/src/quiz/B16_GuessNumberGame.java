package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	/*
	 	������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�.
	 	
	 	1. �÷��̾�� 8���� �õ��� �� �� �ִ�.
	 	
	 	2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
	 	
	 		���ڿ� ��ġ�� �� ���� ��� - Strike
	 		���ڸ� ���� ��� - Ball
	 		
	 	ex : ������ 3456�� ��
	 	
	 		>> 5633		4Ball
	 		>> 3789		1 Strike
	 		>> 3654		1 Strike 3 Ball
	 		
	 	* ���߰� ���� �� ������ ������� �˷��ֱ�
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
		
		System.out.println("������ " + answer);
		
		while (cnt < 8) {
			cnt++;
			ball = 0; strike = 0;
			
			while (true) {
				System.out.print("4�ڸ� ���ڸ� ���纸���� >> ");
				
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
				else System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
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
			System.out.println("����! " + cnt + "�� ���� ���߼̽��ϴ�.");
		} else {
			System.out.println("����! ������ " + answer + " �����ϴ�.");
		}
	}
}