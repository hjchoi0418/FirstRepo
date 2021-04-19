package quiz;

import java.util.Scanner;

public class B14_Prime {

	/*
	 * 사용자로부터 숫자를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	 * 
	 * 1과 자기 자신으로만 나누어 떨어지는 수 ex : 7, 11, 13, 17
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j;

		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();

		for (int i = 2; i <= input; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j)
				System.out.println(i);
		}
	}
}