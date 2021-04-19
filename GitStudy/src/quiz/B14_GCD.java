package quiz;

import java.util.Scanner;

public class B14_GCD {

	/*
	 	두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요.
	 	
	 	최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 두개 입력 >> ");

		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		if (input2 > input1) {
			int tmp;
			tmp = input1;
			input1 = input2;
			input2 = tmp;
		}

		for (int i = input2; i > 0; i--) {
			if (input2 % i != 0) {
				continue;
			}
			if (input1 % i == 0) {
				System.out.println("최대공약수는 " + i);
				break;
			}
		}
	}
}
