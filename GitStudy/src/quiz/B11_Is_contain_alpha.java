package quiz;

import java.util.Scanner;

public class B11_Is_contain_alpha {

	/*
	 	����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
	 	������ false�� ���
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� >> ");
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
