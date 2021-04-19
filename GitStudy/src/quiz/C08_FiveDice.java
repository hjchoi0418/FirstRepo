package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C08_FiveDice {

	/*
	 * 랜덤으로 5개의 주사위를 굴린 다음에 결과를 통해 다음을 구분하는 클래스를 만들어보세요.
	 * 
	 * 1. 풀하우스 (같은 눈이 2개 + 3개) (11666 / 22333 / ...) 2. 스몰 스트레이트 (1234 / 2345 /
	 * 3456) 3. 라지 스트레이트 (12345 / 23456) 4. 4 다이스 (같은 숫자 4개) 5. 5 다이스 (같은 숫자 5개)
	 * 
	 * ※ 게임까지 구현하고 싶으신 분은 Yacht Dice을 검색해보세요.
	 * 
	 * # 메서드
	 * 
	 * (1) 모든 주사위를 던지는 메서드
	 * 
	 * (2) 원하는 주사위를 제외하고 나머지를 던지는 메서드 (2번 까지 가능)
	 * 
	 * (3) 주사위를 새로 던질 때마다 위의 1,2,3,4,5 중 해당하는 것이 있는지 체크하는 메서드
	 */

	int[] dices = new int[5];
	int rollCount;

	public C08_FiveDice() {
		rollCount = 2;
	}

	void rollAll() {
		System.out.println("주사위를 모두 굴립니다.");
		for (int i = 0; i < dices.length; i++)
			dices[i] = (int) (Math.random() * 6) + 1;
		Arrays.sort(dices, 0, 5);
		rollCount = 2;
		check();
	}

	void rollSelect(int num) {
		if (rollCount <= 0)
			System.out.println("주사위를 더 이상 선택해서 굴릴 수 없습니다.");
		else {
			System.out.print(num + "번째 주사위를 제외한 모든 주사위를 굴립니다. ");
			for (int i = 0; i < dices.length; i++) {
				if (i != num - 1)
					dices[i] = (int) (Math.random() * 6) + 1;
			}
			Arrays.sort(dices, 0, 5);
			rollCount--;
			System.out.printf("(남은 횟수 : %d)", rollCount);
			System.out.println();
			check();
		}
	}

	void check() {
		Arrays.sort(dices, 0, 5);
		System.out.println("현재 주사위 : " + Arrays.toString(dices));
		if (dices[0] == dices[4])
			System.out.println("5 다이스!!");
		else if (dices[0] == dices[3] || dices[1] == dices[4])
			System.out.println("4 다이스!!");
		else if (dices[0] + 1 == dices[1] && dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3]
				&& dices[3] + 1 == dices[4])
			System.out.println("라지 스트레이트!!");
		else if ((dices[0] + 1 == dices[1] && dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3])
				|| (dices[1] + 1 == dices[2] && dices[2] + 1 == dices[3] && dices[3] + 1 == dices[4]))
			System.out.println("스몰 스트레이트!!");
		else if ((dices[0] == dices[1] && dices[2] == dices[4]) || (dices[0] == dices[2] && dices[3] == dices[4]))
			System.out.println("풀하우스!!");
		System.out.println();
	}

	public static void main(String[] args) {
		C08_FiveDice d1 = new C08_FiveDice();
		Scanner sc = new Scanner(System.in);
		int input;

		d1.rollAll();
		while (true) {
			System.out.println("(1) 모든 주사위 굴리기, (2) 선택한 주사위를 제외하고 굴리기, (3) 현재 주사위 확인");
			input = sc.nextInt();
			switch (input) {
			case 1:
				d1.rollAll();
				break;
			case 2:
				System.out.print("유지할 주사위 번호 (1 ~ 5) >> ");
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
