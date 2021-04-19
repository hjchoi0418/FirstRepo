package study;
import java.util.Scanner;

import quiz.A01_printQuiz;
import quiz.A03_Introduce;

public class B02_Import {
	/*
 	import
 		- 다른 패키지에 정의되어있는 클래스를 사용하기 위해서는
 		해당 클래스의 정확한 경로를 import 해야 한다.
 		- 같은 패키지에 존재하는 클래스는 import 없이도 사용할 수 있다.
 		- 해당 패키지의 모든 클래스를 불러오고 싶을 때는 *를 사용한다.
	 */
	public static void main(String[] args) {
		
		// 같은 default package의 자원
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		// 다른 패키지(quiz)의 자원을 사용하기 위해서는 import가 필요하다.
		A01_printQuiz.main(null);
		A03_Introduce.main(null);
		
//		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
		
	}
}
