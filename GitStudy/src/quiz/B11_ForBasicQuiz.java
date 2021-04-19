package quiz;

public class B11_ForBasicQuiz {

	/*
	   사용자가 숫자를 입력했을 때
	  
	  	1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	  
	 	2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요
	 */
	public static void main(String[] args) {

		// 1번 문제의 시작 숫자는 10, 2번 문제의 시작 숫자는 1
		int start1 = 10, start2 = 1;

		int end1 = -50, end2 = -50;
		int sum = 0;

		// 만약 start값이 end값보다 크다면, 두 값을 교환한다
		if (start1 > end1) {
			int temp = start1;
			start1 = end1;
			end1 = temp;
		}

		if (start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		}

		for (int i = start1; i <= end1; ++i) {
			sum += i;
		}

		System.out.println("10부터 user가 입력한 숫자까지의 총합: " + sum);

		System.out.println();
		System.out.printf("#### 1 ~ %d 사이의 5의 배수만 출력 ####\n", start2 > end2 ? end2 : start2);
		for (int i = start2; i <= end2; ++i) {

			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}