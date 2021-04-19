package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요.
	 	
	 	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	 3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
	 	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	 	factorial : (n) * (n-1) * (n-2) * ... * 3 * 2 * 1
	 */
	
	public static void main(String[] args) {
		System.out.println("1. " + isAlpha('Z'));
		System.out.println("2. " + isThreeMultiple(9));
		System.out.println("3. " + oddOrEven(4));
		System.out.println("4. " + Arrays.toString(divisor(100)));
		System.out.println("5. " + isPrime(17));
		System.out.println("6. " + factorial(5));
	}
	
	public static boolean isAlpha(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	
	public static boolean isThreeMultiple(int num) {
		return (num != 0 && num % 3 == 0);
	}
	
	public static String oddOrEven(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	public static int[] divisor(int num) {
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		
		int[] result = new int[count];
		count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result[count] = i;
				count++;
			}
		}
		return result;
	}
	
	public static boolean isPrime(int num) {
		boolean result = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		// 재귀함수
		return num * factorial(num - 1);
		
//		int result = 1;
//		for (int i = num; i > 0; i--)
//			result *= i;
//		return result;
	}
}