package quiz;

import java.util.Scanner;

public class B15_Count369 {

	/*
	 	����ڷκ��� ������ �ϳ� �Է¹ް�
	 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������.
	 */
	
	public static void main(String[] args) {
		/*
		// 1. ���ڿ��� Ǯ��
		
		Scanner sc = new Scanner(System.in);
		int clap = 0;
		String str = "";
		
		System.out.print("369 ���� �����?? >> ");
		int input = sc.nextInt();
		
		int i = 1;
		while (i <= input) {
			str = "" + i;
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9')
					clap++;
			}
			
			i++;
		}
		System.out.printf("�ڼ��� �� %d��", clap);
		*/
		
		// 2. ������ Ǯ��
		Scanner sc = new Scanner(System.in);
		int clap = 0;
		int tmp;
		
		System.out.print("369 ���� �����?? >> ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			tmp = i;
			while (true) {
				if (tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9)
					clap++;
				
				if (tmp >= 10)
					tmp /= 10;
				else break;
			}
		}
		System.out.printf("�ڼ��� �� %d��", clap);
	}
}