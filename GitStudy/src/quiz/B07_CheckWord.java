package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		
		/*
		 	사용자로부터 단어를 하나 입력받고 첫 번째 글자와
		 	마지막 번째 글자가 일치하면 "OK"를 출력
		 	아니라면 "NOT OK"를 출력해보세요
		 */
		Scanner sc = new Scanner(System.in);
		
		// next() : 다음 문자열(단어)을 String 타입으로 받아오기 (공백, \t 기준)
		// nextLine() : 다음 한 줄의 문자열을 String 타입으로 받아오기 (\n 기준)
		
		System.out.print("단어를 입력하세요 >> ");
		String str = sc.next();
		if (str.charAt(0) == str.charAt(str.length() - 1))
			System.out.println("OK");
		else
			System.out.println("NOT OK");
	}
	
}
