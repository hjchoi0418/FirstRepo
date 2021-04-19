package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����.
	 	
	 	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�." �Ǵ� "Ȧ���Դϴ�."�� ��ȯ�ϴ� �Լ�
	 	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
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
		return num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
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
		// ����Լ�
		return num * factorial(num - 1);
		
//		int result = 1;
//		for (int i = num; i > 0; i--)
//			result *= i;
//		return result;
	}
}