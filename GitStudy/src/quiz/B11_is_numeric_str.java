package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	/*
	 	입력받은 문자열에 숫자만 포함되어 있으면 result가 1
	 	다른 문자가 포함되어 있다면 result가 0
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		
		System.out.print("문자열 입력 >> ");
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				result = 0;
				break;
			}
		}
		System.out.println(result);
	}
}
