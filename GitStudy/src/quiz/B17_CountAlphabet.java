package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	/*
	  	����ڷκ��� ������ �ϳ� �Է¹ް�
	  	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ��� �غ�����
	  	(��ҹ��� ���о��� ����)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];

		System.out.print("���� �Է� >> ");
		String input = sc.nextLine();
		
		// str.toUpperCase(); - ���ڿ��� �빮�ڷ� ��ȯ
		// str.toLowerCase(); - ���ڿ��� �ҹ��ڷ� ��ȯ

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < count.length; j++) {
				if (input.charAt(i) == 'A' + j || input.charAt(i) == 'a' + j) {
					count[j]++;
				}
			}
		}
		
//		if (ch >= 'A' && ch <= 'Z')
//			count[ch - 'A']++;

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				System.out.printf("%c : %d��\n", 'A' + i, count[i]);
		}
	}
}
