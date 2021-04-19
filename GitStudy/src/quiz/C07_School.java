package quiz;

import java.util.Random;

import quiz.School.*;

public class C07_School {

	/*
	 	1. 각 반의 최대 정원은 30명이다.
	 	
	 	2-1. 프로그래밍 반 학생은 각자의 국어, 영어, 수학, 프로그래밍 언어 점수가 있다.
	 	
	 	2-2. 네트워크 반 학생은 각자의 국어, 영어, 리눅스, CCNA 점수가 있다.
	 	
	 	2-3. 머신러닝 반 학생은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다.
	 	
	 	3. 모든 학생의 점수와 이름을 랜덤으로 생성한다.
	 		학번은 중복없이 순차적으로 생성된다. (또는 중복없이 랜덤)
	 	
	 	4. 성적표 메서드를 통해 각 학생의 [이름/총점/평균점수]를 볼 수 있다.
	 */
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		Programming[] p1 = new Programming[30];
		Network[] n1 = new Network[30];
		MachineLearning[] m1 = new MachineLearning[30];
		
		System.out.println("########## 프로그래밍 반 ##########\n");
		for (int i = 0; i < 30; i++) {
			p1[i] = new Programming(i + 1);
			p1[i].report_card();
		}
		System.out.println("\n########## 네트워크 반 ##########\n");
		for (int i = 0; i < 30; i++) {
			n1[i] = new Network(i + 1);
			n1[i].report_card();
		}
		System.out.println("\n########## 머신러닝 반 ##########\n");
		for (int i = 0; i < 30; i++) {
			m1[i] = new MachineLearning(i + 1);
			m1[i].report_card();
		}
	}
}
//
//class Student {
//	String name;
//	String st_num;
//	int korean;
//	int english;
//	int sum;
//	double avg;
//	
//	public void report_card() {
//		System.out.printf("이름 : %s, 총점 : %d, 평균 : %.2f\n", name, sum, avg);
//	}
//}
//
//class Programming extends Student {
//	int math;
//	int programming;
//	
//	public Programming() {}
//	
//	public Programming(String name, int num, int korean, int english, int math, int programming) {
//		this.name = name;
//		this.korean = korean;
//		this.english = english;
//		this.math = math;
//		this.programming = programming;
//		this.st_num = "P";
//		this.st_num += num;
//		
//		this.sum = korean + english + math + programming;
//		this.avg = sum / 4.0;
//	}
//}
//
//class Network extends Student {
//	int linux;
//	int ccna;
//	
//	public Network(String name, int num, int korean, int english, int linux, int ccna) {
//		this.name = name;
//		this.korean = korean;
//		this.english = english;
//		this.linux = linux;
//		this.ccna = ccna;
//		this.st_num = "N";
//		this.st_num += num;
//		
//		this.sum = korean + english + linux + ccna;
//		this.avg = sum / 4.0;
//	}
//}
//
//class MachineLearning extends Programming {
//	int statistics;
//	
//	public MachineLearning(String name, int num, int korean, int english, int math, int programming, int statistics) {
//		this.name = name;
//		this.korean = korean;
//		this.english = english;
//		this.math = math;
//		this.programming = programming;
//		this.statistics = statistics;
//		this.st_num = "M";
//		this.st_num += num;
//		
//		
//		this.sum = korean + english + math + programming + statistics;
//		this.avg = sum / 5.0;
//	}
//}