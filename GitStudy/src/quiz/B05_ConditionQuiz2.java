package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true
        7. ����ڰ� �Է��� ���ڿ��� exit�� �� true        
		 */ 
		
		Scanner sc = new Scanner(System.in);
		
		char a, b, c, d, e, f;
		String userInput;
		a = 'q';
		b = ' ';
		c = '0';
		d = 'Z';
		e = '��';
		f = '��';
		
		
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z')));
		System.out.println("5. " + ((e >= 0x1100 && e <= 0x11FF) ||
							(e >= 0x3131 && e<= 0x318F) || (e >= 0xAC00 && e <= 0xD7A3)));
		System.out.println("6. " + ((f >= 0x3040 && f <= 0x30FF) || (f >= 0x31F0 && f <= 0x31FF)));
		
		
		System.out.print("7. ���ڿ� �Է� > ");
		userInput = sc.next();
		System.out.println(userInput.equals("exit"));
		
	}
}
