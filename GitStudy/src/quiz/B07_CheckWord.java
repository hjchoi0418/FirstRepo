package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		
		/*
		 	����ڷκ��� �ܾ �ϳ� �Է¹ް� ù ��° ���ڿ�
		 	������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
		 	�ƴ϶�� "NOT OK"�� ����غ�����
		 */
		Scanner sc = new Scanner(System.in);
		
		// next() : ���� ���ڿ�(�ܾ�)�� String Ÿ������ �޾ƿ��� (����, \t ����)
		// nextLine() : ���� �� ���� ���ڿ��� String Ÿ������ �޾ƿ��� (\n ����)
		
		System.out.print("�ܾ �Է��ϼ��� >> ");
		String str = sc.next();
		if (str.charAt(0) == str.charAt(str.length() - 1))
			System.out.println("OK");
		else
			System.out.println("NOT OK");
	}
	
}
