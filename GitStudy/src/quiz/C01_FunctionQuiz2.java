package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {

	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요. (2)
	 	
	 	 1. 최대값을 매개변수로 전달 받으면
	 	 	0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는
	 	 	range 함수를 만들어보세요.
	 	 	
	 	 	ex : range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	 	
	 	 2. 최소값과 최대값을 매개변수로 받으면, 그 사이에 존재하는
	 	 	모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	 	range 함수를 만들어보세요. (최소값 이상, 최대값 미만)
	 	 	
	 	 	ex : range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	 	 	
	 	 3. 최소값과 최대값과 증가값을 매개변수로 받으면
	 	 	최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int 배열을
	 	 	생성하여 반환하는 range 함수를 만들어보세요. (최소값 이상, 최대값 미만)
	 	 	
	 	 	ex : range(50, 56, 5)의 결과 -> [50, 55]
	 	 		 range(50, 55, 5)의 결과 -> [50]
	 */
	public static void main(String[] args) {
		System.out.println("1. " + Arrays.toString(range(10)));
		System.out.println("2. " + Arrays.toString(range(5, 10)));
		System.out.println("3. " + Arrays.toString(range(50, 56, 5)));
	}
	
	public static int[] range(int max) {
		int[] result = new int[max];
		for (int i = 0; i < max; i++)
			result[i] = i;
		return result;
	}
	
	public static int[] range(int min, int max) {
		int[] result = new int[max - min];
		for (int i = min; i < max; i++)
			result[i - min] = i;
		return result;
	}
	
	public static int[] range(int min, int max, int inc) {
		int size = (max - min) / inc;
		if ((max - min) % inc != 0)
			size += 1;
		int[] result = new int[size];
		int count = 0;
		for (int i = min; i < max; i += inc) {
			result[count] = i;
			count++;
		}
		return result;
	}
}
