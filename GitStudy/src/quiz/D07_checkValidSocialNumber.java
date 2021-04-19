package quiz;

import java.util.Scanner;

public class D07_checkValidSocialNumber {

	/*
	 * 사용자가 주민등록번호를 입력하면 그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요.
	 * 
	 * 맨앞 2자리 숫자 월 자리에 01 ~ 12 이내의 숫자 일 자리에 01 ~ 31 이내의 숫자 7번째 자리 '-' 뒷자리 전부 숫자
	 */

	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				return true;
			} else if (year % 100 == 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean checkValidSocialNumber(String SocialNumber) {
		int len = SocialNumber.length();

		if (len != 14) {
			System.out.println("주민등록번호 길이가 맞지않음");
			return false;
		}

		try {
		int year = Integer.parseInt("19" + SocialNumber.charAt(0) + SocialNumber.charAt(1));
		int month = Integer.parseInt("" + SocialNumber.charAt(2) + SocialNumber.charAt(3));
		int day = Integer.parseInt("" + SocialNumber.charAt(4) + SocialNumber.charAt(5));


		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("일 부분 범위 밖의 값");
				return false;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.println("일 부분 범위 밖의 값");
				return false;
			}
		} else if (month == 2) {
			if (isLeapYear(year)) {
				if (day < 1 || day > 29) {
					System.out.println("일 부분 범위 밖의 값");
					return false;
				}
			} else {
				if (day < 1 || day > 28) {
					System.out.println("일 부분 범위 밖의 값");
					return false;
				}
			}
		} else {
			System.out.println("월 부분 범위 밖의 값");
			return false;
		}
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 값이 있음");
			return false;
		}

		for (int i = 0; i < len; i++) {
			char ch = SocialNumber.charAt(i);

			if (i < 2 && !checkNumeric(ch)) {
				System.out.println("앞자리가 숫자가 아님");
				return false;
			} else if (i == 6 && ch != '-') {
				System.out.println("'-' 없음");
				return false;
			} else if (i > 6 && !checkNumeric(ch)) {
				System.out.println("뒷자리가 숫자가 아님");
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("주민등록번호 입력 >> ");
			String input = sc.nextLine();
			if (checkValidSocialNumber(input))
				System.out.println("올바른 주민등록번호입니다.");
			System.out.println("------------------------------");
		}
	}
}
