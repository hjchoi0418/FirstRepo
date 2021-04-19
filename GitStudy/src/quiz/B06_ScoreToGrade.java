package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	/*
	 	점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
	 	
	 	90점 이상 : A등급
	 	80점 이상 : B등급
	 	70점 이상 : C등급
	 	60점 이상 : D등급
	 	그 외 : F등급
	 	
	 	* 유효한 점수는 0 ~ 100점 입니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 (0 ~ 100) >> ");
		
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다. 0 ~ 100의 값을 입력해주세요.");
		} else {
			if (score >= 90)
				System.out.println("A등급");
			else if (score >= 80)
				System.out.println("B등급");
			else if (score >= 70)
				System.out.println("C등급");
			else if (score >= 60)
				System.out.println("D등급");
			else
				System.out.println("F등급");
		}
		
	}
	
}
