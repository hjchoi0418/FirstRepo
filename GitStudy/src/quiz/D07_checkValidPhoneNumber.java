package quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	/*
	 	사용자로부터 핸드폰 번호를 입력받으면
	 	올바른 전화번호인지 구분하는 프로그램을 만들어보세요.
	 	
	 	앞의 3자리가 숫자
	 	두번째 숫자는 3자리 혹은 4자리
	 	세번째 숫자는 4자리
	 	4번째, 8번째 또는 9번째 문자는 '-'
	 */
	
	public static boolean checkPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() < 12 || phoneNumber.length() > 13)
			return false;
		
		char[] num = new char[phoneNumber.length()];
		
		for (int i = 0; i < phoneNumber.length(); i++) {
			num[i] = phoneNumber.charAt(i);
		}
		
		for (int i = 0; i < 3; i++) {
			if (num[i] < '0' || num[i] > '9') return false;
			else if (num[3] != '-') return false;
		}
		
		if (num[7] != '-') {
			for (int i = 4; i < 8; i++) {
				if (num[i] < '0' || num[i] > '9') return false;
			}
			
			for (int i = 9; i < 13; i++) {
				if (num[i] < '0' || num[i] > '9')  return false;
			}
		} else if (num[8] != '-') {
			if (phoneNumber.length() != 12) return false;
			
			for (int i = 4; i < 7; i++) {
				if (num[i] < '0' || num[i] > '9') return false;
			}
			
			for (int i = 8; i < 12; i++) {
				if (num[i] < '0' || num[i] > '9') return false;
			}
		}
		return true;
	}
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidPhoneNumber(String phoneNumber) {
		int len = phoneNumber.length();
		
		if (len != 12 && len != 13) {
			System.out.println("[invalid] 길이가 올바르지 않음");
			return false;
		}
		
		for (int i = 0; i < len; ++i) {
			char ch = phoneNumber.charAt(i);
			
			if (i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] 맨앞 3자리에 숫자 아닌 것이 있음");
				return false;
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] 가운데 자리에 숫자 아닌 것이 있음");
				return false;
			} else if (((len == 12 && i > 7) || (len == 13 && i > 8)) && !checkNumeric(ch)){
				System.out.println("[invalid] 마지막 자리에 숫자 아닌 것이 있음");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		D07_checkValidPhoneNumber check = new D07_checkValidPhoneNumber();
		Scanner sc;
		String input;
		
		String num1 = "010-1212-3434";
		String num2 = "010-123-3456";
		String num3 = "0101-123-4567";
		String num4 = "abc-defg-hijk";
		
		System.out.println(checkPhoneNumber(num1));
		System.out.println(checkPhoneNumber(num2));
		System.out.println(checkPhoneNumber(num3));
		System.out.println(checkPhoneNumber(num4));
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.print("휴대폰번호 입력 >> ");
			input = sc.nextLine();
			System.out.println(check.checkValidPhoneNumber(input));
		}
	}
}
