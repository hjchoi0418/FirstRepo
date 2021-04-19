package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	/*
	 	1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�.
	 	
	 	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�.
	 		(�������� �����ϴ� ���� :
	 		apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 	
	 	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String[] fruit = { "apple", "banana", "kiwi", "orange", 
				"peach", "strawberry", "pineapple" };
		int[] count = new int[fruit.length];
		
		System.out.print("���� ������ ���� �Է� >> ");
		int input = sc.nextInt();

		String[] basket = new String[input];
		
		for (int i = 0; i < input; i++) {
			basket[i] = fruit[rand.nextInt(fruit.length)];
		}
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < fruit.length; j++) {
				if (basket[i].equals(fruit[j])) {
					count[j]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < fruit.length; i++) {
			if (count[i] > 0) {
				System.out.println(fruit[i] + " : " + count[i]);
			}
		}
	}
}