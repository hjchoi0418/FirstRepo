package quiz;

import java.util.Scanner;

public class B11_Reverse {

	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("���� �Է� >> ");
		str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - i - 1));			
		}
	}
}
