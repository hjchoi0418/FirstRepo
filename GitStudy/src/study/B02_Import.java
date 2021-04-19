package study;
import java.util.Scanner;

import quiz.A01_printQuiz;
import quiz.A03_Introduce;

public class B02_Import {
	/*
 	import
 		- �ٸ� ��Ű���� ���ǵǾ��ִ� Ŭ������ ����ϱ� ���ؼ���
 		�ش� Ŭ������ ��Ȯ�� ��θ� import �ؾ� �Ѵ�.
 		- ���� ��Ű���� �����ϴ� Ŭ������ import ���̵� ����� �� �ִ�.
 		- �ش� ��Ű���� ��� Ŭ������ �ҷ����� ���� ���� *�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		
		// ���� default package�� �ڿ�
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		// �ٸ� ��Ű��(quiz)�� �ڿ��� ����ϱ� ���ؼ��� import�� �ʿ��ϴ�.
		A01_printQuiz.main(null);
		A03_Introduce.main(null);
		
//		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
		
	}
}
