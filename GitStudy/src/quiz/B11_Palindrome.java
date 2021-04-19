package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	/*
	 	사용자로부터 단어를 하나 입력받고
	 	해당 단어가 회문이라면 "PALINDROME"을 출력
	 	회문이 아니라면 "NOT PALINDROME"을 출력해보세요
	 	
	 	* 회문? MOM, BOB, ABBA, MADAM 처럼 좌우 대칭인 단어
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str, result;
		result = "PALINDROME";
		
		System.out.print("단어 입력 >> ");
		str = sc.next();
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.println(result);
	}
}
