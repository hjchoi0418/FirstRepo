package quiz;

import java.util.Scanner;

public class B11_Is_contain_alpha {

	/*
	 	사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
	 	없으면 false를 출력
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		String input = sc.nextLine();
		boolean is_contain_alpha = false;
		
		for (int i = 0; i < input.length(); ++i) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z' ||
					input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				is_contain_alpha = true;
				break;
			}
		}
		System.out.println(is_contain_alpha);
	}
	
}
