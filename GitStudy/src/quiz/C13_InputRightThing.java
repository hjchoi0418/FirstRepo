package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	 	사용자로부터 숫자를 제대로 입력받을 때까지 계속 입력받는 프로그램을 만들어보세요.
	 	(잘못된 값이 입력되어도 강제종료 되지 않고, 올바른 값이 입력되면 출력 후 프로그램이 종료)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = inputInt("숫자 > ");
		int b = inputInt("두 번째 숫자 >");
		
		System.out.println("입력받은 값 " + a);
		System.out.println("프로그램 종료");
		
//		while (true) {
//			try {
//				System.out.print("숫자 입력 >> ");
//				a = sc.nextInt();
//				break;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("올바른 값이 아닙니다. 다시 입력하세요.");
//				sc = new Scanner(System.in);
//			}
//		}
//		System.out.println("입력한 값은 " + a);
	}
	
	public static int inputInt(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
//		sc.close();
		
		return num;
	}
}
