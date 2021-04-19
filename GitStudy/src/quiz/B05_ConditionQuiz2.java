package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true
        7. 사용자가 입력한 문자열이 exit일 때 true        
		 */ 
		
		Scanner sc = new Scanner(System.in);
		
		char a, b, c, d, e, f;
		String userInput;
		a = 'q';
		b = ' ';
		c = '0';
		d = 'Z';
		e = '감';
		f = 'あ';
		
		
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z')));
		System.out.println("5. " + ((e >= 0x1100 && e <= 0x11FF) ||
							(e >= 0x3131 && e<= 0x318F) || (e >= 0xAC00 && e <= 0xD7A3)));
		System.out.println("6. " + ((f >= 0x3040 && f <= 0x30FF) || (f >= 0x31F0 && f <= 0x31FF)));
		
		
		System.out.print("7. 문자열 입력 > ");
		userInput = sc.next();
		System.out.println(userInput.equals("exit"));
		
	}
}
