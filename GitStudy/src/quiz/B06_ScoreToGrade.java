package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	/*
	 	������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	 	
	 	90�� �̻� : A���
	 	80�� �̻� : B���
	 	70�� �̻� : C���
	 	60�� �̻� : D���
	 	�� �� : F���
	 	
	 	* ��ȿ�� ������ 0 ~ 100�� �Դϴ�.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� (0 ~ 100) >> ");
		
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("�߸��� �����Դϴ�. 0 ~ 100�� ���� �Է����ּ���.");
		} else {
			if (score >= 90)
				System.out.println("A���");
			else if (score >= 80)
				System.out.println("B���");
			else if (score >= 70)
				System.out.println("C���");
			else if (score >= 60)
				System.out.println("D���");
			else
				System.out.println("F���");
		}
		
	}
	
}
