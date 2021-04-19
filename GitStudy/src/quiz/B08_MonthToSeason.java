package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
		
		/*
		 	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요.
		 	(switch-case문을 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 (1 ~ 12) >> ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("올바른 달을 입력해주세요 (1월 ~ 12월)");
			break;
		}
	}
}
