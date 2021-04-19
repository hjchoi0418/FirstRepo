package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	/*
	 	1. 사용자로부터 배열의 크기를 입력받는다.
	 	
	 	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다.
	 		(랜덤으로 등장하는 과일 :
	 		apple, banana, kiwi, orange, peach, strawberry, pineapple)
	 	
	 	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String[] fruit = { "apple", "banana", "kiwi", "orange", 
				"peach", "strawberry", "pineapple" };
		int[] count = new int[fruit.length];
		
		System.out.print("랜덤 과일의 개수 입력 >> ");
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