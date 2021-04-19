package quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {

	public static void main(String[] args) {

		int[][] numArr = new int[][] {
			{ 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1 },
			{ 1, 1, 1, 1, 1 }
			};

		// 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔보세요.

		// 2. numArr의 총합과 평균을 구해서 출력해보세요.

		// 3. numArr의 각 행의 합을 모두 구해서 출력해보세요.

		// 4. numArr의 각 열의 합을 모두 구해서 출력해보세요.

		Random rand = new Random();
		int sum = 0, count = 0;
		int row_size = 0;
		double avg;
		int[] row_sum = new int[numArr.length];
		
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i].length > row_size)
				row_size = numArr[i].length;
		}
		int[] col_sum = new int[row_size];

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = rand.nextInt(101);
				sum += numArr[i][j];
				row_sum[i] += numArr[i][j];
				col_sum[j] += numArr[i][j];
				count++;
			}
		}

		avg = (double)sum / count;
		System.out.printf("합 : %d, 평균 : %f\n", sum, avg);
		
		// Arrays.toString() : 배열 편하게 출력하기
		System.out.println("행의 합 : " + Arrays.toString(row_sum));
		System.out.println("열의 합 : " + Arrays.toString(col_sum));
		
//		for (int i = 0; i < row_sum.length; i++) {
//			System.out.println((i + 1) + "행의 합 : " + row_sum[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < col_sum.length; i++) {
//			System.out.println((i + 1) + "열의 합 : " + col_sum[i]);
//		}
	}
}