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

		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����.

		// 2. numArr�� ���հ� ����� ���ؼ� ����غ�����.

		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.

		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.

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
		System.out.printf("�� : %d, ��� : %f\n", sum, avg);
		
		// Arrays.toString() : �迭 ���ϰ� ����ϱ�
		System.out.println("���� �� : " + Arrays.toString(row_sum));
		System.out.println("���� �� : " + Arrays.toString(col_sum));
		
//		for (int i = 0; i < row_sum.length; i++) {
//			System.out.println((i + 1) + "���� �� : " + row_sum[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < col_sum.length; i++) {
//			System.out.println((i + 1) + "���� �� : " + col_sum[i]);
//		}
	}
}