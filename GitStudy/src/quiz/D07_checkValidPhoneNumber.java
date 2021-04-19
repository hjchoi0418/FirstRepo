package quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	/*
	 	����ڷκ��� �ڵ��� ��ȣ�� �Է¹�����
	 	�ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������.
	 	
	 	���� 3�ڸ��� ����
	 	�ι�° ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
	 	����° ���ڴ� 4�ڸ�
	 	4��°, 8��° �Ǵ� 9��° ���ڴ� '-'
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
			System.out.println("[invalid] ���̰� �ùٸ��� ����");
			return false;
		}
		
		for (int i = 0; i < len; ++i) {
			char ch = phoneNumber.charAt(i);
			
			if (i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] �Ǿ� 3�ڸ��� ���� �ƴ� ���� ����");
				return false;
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] ��� �ڸ��� ���� �ƴ� ���� ����");
				return false;
			} else if (((len == 12 && i > 7) || (len == 13 && i > 8)) && !checkNumeric(ch)){
				System.out.println("[invalid] ������ �ڸ��� ���� �ƴ� ���� ����");
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
			System.out.print("�޴�����ȣ �Է� >> ");
			input = sc.nextLine();
			System.out.println(check.checkValidPhoneNumber(input));
		}
	}
}
