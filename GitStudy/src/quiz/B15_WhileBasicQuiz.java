package quiz;

public class B15_WhileBasicQuiz {

	/*
	 	while문을 이용하여
	 	
	 	1. 1부터 100까지의 3의 배수의 총합
	 	
	 	2. 200부터 1까지 출력
	 	
	 	3. continue를 이용하여 300부터 500사이의 7의 배수만 출력
	 	
	 	4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 */
	
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		
		while (i <= 100) {
			if (i % 3 == 0)
				sum += i;
			i++;
		}
		System.out.println("1. " + sum);
		
		i = 200;
		
		System.out.print("2. ");
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		
		i = 300 - 1;
		
		System.out.print("3. ");
		while (++i <= 500) {
			if (i % 7 != 0) continue;
			System.out.println(i);
		}
		
		i = 1; sum = 0;
		
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0)
				sum += i;
			i++;
		}
		System.out.println("4. " + sum);
	}
}