package quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	// �ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������.
	// (���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double exchangeRate = 0.00089;
		double fee = 0.0175;
		
		System.out.print("�޷��� ȯ���� ��ȭ �Է� > ");
		int won = sc.nextInt();
		double dollar = won * exchangeRate;
		
		System.out.printf("ȯ���� �޷��� %.2f�޷� �Դϴ�.\n", dollar);
		System.out.printf("ȯ�� ������ %.2f�޷��� ������ %.2f�޷��� ���޵˴ϴ�.", dollar * fee, dollar - (dollar * fee));
		
	}
}
