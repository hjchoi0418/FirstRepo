package quiz;

import java.util.Scanner;

public class B11_Reverse {

	// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문장 입력 >> ");
		str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - i - 1));			
		}
	}
}
