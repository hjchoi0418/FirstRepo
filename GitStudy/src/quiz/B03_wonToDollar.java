package quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	// 한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요.
	// (현재 환율은 구글 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.75%)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double exchangeRate = 0.00089;
		double fee = 0.0175;
		
		System.out.print("달러로 환전할 원화 입력 > ");
		int won = sc.nextInt();
		double dollar = won * exchangeRate;
		
		System.out.printf("환전된 달러는 %.2f달러 입니다.\n", dollar);
		System.out.printf("환전 수수료 %.2f달러를 제외한 %.2f달러가 지급됩니다.", dollar * fee, dollar - (dollar * fee));
		
	}
}
