package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	 	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
	 	
	 	* ȸ��? MOM, BOB, ABBA, MADAM ó�� �¿� ��Ī�� �ܾ�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str, result;
		result = "PALINDROME";
		
		System.out.print("�ܾ� �Է� >> ");
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
