package quiz;

import java.util.Scanner;

public class D07_checkValidSocialNumber {

	/*
	 * ����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ� �� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������.
	 * 
	 * �Ǿ� 2�ڸ� ���� �� �ڸ��� 01 ~ 12 �̳��� ���� �� �ڸ��� 01 ~ 31 �̳��� ���� 7��° �ڸ� '-' ���ڸ� ���� ����
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
			System.out.println("�ֹε�Ϲ�ȣ ���̰� ��������");
			return false;
		}

		try {
		int year = Integer.parseInt("19" + SocialNumber.charAt(0) + SocialNumber.charAt(1));
		int month = Integer.parseInt("" + SocialNumber.charAt(2) + SocialNumber.charAt(3));
		int day = Integer.parseInt("" + SocialNumber.charAt(4) + SocialNumber.charAt(5));


		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("�� �κ� ���� ���� ��");
				return false;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.println("�� �κ� ���� ���� ��");
				return false;
			}
		} else if (month == 2) {
			if (isLeapYear(year)) {
				if (day < 1 || day > 29) {
					System.out.println("�� �κ� ���� ���� ��");
					return false;
				}
			} else {
				if (day < 1 || day > 28) {
					System.out.println("�� �κ� ���� ���� ��");
					return false;
				}
			}
		} else {
			System.out.println("�� �κ� ���� ���� ��");
			return false;
		}
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴ� ���� ����");
			return false;
		}

		for (int i = 0; i < len; i++) {
			char ch = SocialNumber.charAt(i);

			if (i < 2 && !checkNumeric(ch)) {
				System.out.println("���ڸ��� ���ڰ� �ƴ�");
				return false;
			} else if (i == 6 && ch != '-') {
				System.out.println("'-' ����");
				return false;
			} else if (i > 6 && !checkNumeric(ch)) {
				System.out.println("���ڸ��� ���ڰ� �ƴ�");
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�ֹε�Ϲ�ȣ �Է� >> ");
			String input = sc.nextLine();
			if (checkValidSocialNumber(input))
				System.out.println("�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�.");
			System.out.println("------------------------------");
		}
	}
}
