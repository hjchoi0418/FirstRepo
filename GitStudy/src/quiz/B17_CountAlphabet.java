package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	/*
	  	사용자로부터 문장을 하나 입력받고
	  	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력 해보세요
	  	(대소문자 구분없이 셀것)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];

		System.out.print("문장 입력 >> ");
		String input = sc.nextLine();
		
		// str.toUpperCase(); - 문자열을 대문자로 변환
		// str.toLowerCase(); - 문자열을 소문자로 변환

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
				System.out.printf("%c : %d번\n", 'A' + i, count[i]);
		}
	}
}
