package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	/*
	 	�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1
	 	�ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		
		System.out.print("���ڿ� �Է� >> ");
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
