package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {

	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����. (2)
	 	
	 	 1. �ִ밪�� �Ű������� ���� ������
	 	 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
	 	 	range �Լ��� ��������.
	 	 	
	 	 	ex : range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	 	
	 	 2. �ּҰ��� �ִ밪�� �Ű������� ������, �� ���̿� �����ϴ�
	 	 	��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	 	range �Լ��� ��������. (�ּҰ� �̻�, �ִ밪 �̸�)
	 	 	
	 	 	ex : range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 	 	
	 	 3. �ּҰ��� �ִ밪�� �������� �Ű������� ������
	 	 	�ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭��
	 	 	�����Ͽ� ��ȯ�ϴ� range �Լ��� ��������. (�ּҰ� �̻�, �ִ밪 �̸�)
	 	 	
	 	 	ex : range(50, 56, 5)�� ��� -> [50, 55]
	 	 		 range(50, 55, 5)�� ��� -> [50]
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
