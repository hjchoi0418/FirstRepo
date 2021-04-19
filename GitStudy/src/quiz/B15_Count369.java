package quiz;

import java.util.Scanner;

public class B15_Count369 {

	/*
	 	사용자로부터 정수를 하나 입력받고
	 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요.
	 */
	
	public static void main(String[] args) {
		/*
		// 1. 문자열로 풀기
		
		Scanner sc = new Scanner(System.in);
		int clap = 0;
		String str = "";
		
		System.out.print("369 게임 몇까지?? >> ");
		int input = sc.nextInt();
		
		int i = 1;
		while (i <= input) {
			str = "" + i;
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9')
					clap++;
			}
			
			i++;
		}
		System.out.printf("박수는 총 %d번", clap);
		*/
		
		// 2. 정수로 풀기
		Scanner sc = new Scanner(System.in);
		int clap = 0;
		int tmp;
		
		System.out.print("369 게임 몇까지?? >> ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			tmp = i;
			while (true) {
				if (tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9)
					clap++;
				
				if (tmp >= 10)
					tmp /= 10;
				else break;
			}
		}
		System.out.printf("박수는 총 %d번", clap);
	}
}