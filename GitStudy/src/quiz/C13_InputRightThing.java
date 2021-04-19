package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	 	����ڷκ��� ���ڸ� ����� �Է¹��� ������ ��� �Է¹޴� ���α׷��� ��������.
	 	(�߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ��� �� ���α׷��� ����)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = inputInt("���� > ");
		int b = inputInt("�� ��° ���� >");
		
		System.out.println("�Է¹��� �� " + a);
		System.out.println("���α׷� ����");
		
//		while (true) {
//			try {
//				System.out.print("���� �Է� >> ");
//				a = sc.nextInt();
//				break;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("�ùٸ� ���� �ƴմϴ�. �ٽ� �Է��ϼ���.");
//				sc = new Scanner(System.in);
//			}
//		}
//		System.out.println("�Է��� ���� " + a);
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
