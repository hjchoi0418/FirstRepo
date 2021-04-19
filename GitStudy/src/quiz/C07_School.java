package quiz;

import java.util.Random;

import quiz.School.*;

public class C07_School {

	/*
	 	1. �� ���� �ִ� ������ 30���̴�.
	 	
	 	2-1. ���α׷��� �� �л��� ������ ����, ����, ����, ���α׷��� ��� ������ �ִ�.
	 	
	 	2-2. ��Ʈ��ũ �� �л��� ������ ����, ����, ������, CCNA ������ �ִ�.
	 	
	 	2-3. �ӽŷ��� �� �л��� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�.
	 	
	 	3. ��� �л��� ������ �̸��� �������� �����Ѵ�.
	 		�й��� �ߺ����� ���������� �����ȴ�. (�Ǵ� �ߺ����� ����)
	 	
	 	4. ����ǥ �޼��带 ���� �� �л��� [�̸�/����/�������]�� �� �� �ִ�.
	 */
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		Programming[] p1 = new Programming[30];
		Network[] n1 = new Network[30];
		MachineLearning[] m1 = new MachineLearning[30];
		
		System.out.println("########## ���α׷��� �� ##########\n");
		for (int i = 0; i < 30; i++) {
			p1[i] = new Programming(i + 1);
			p1[i].report_card();
		}
		System.out.println("\n########## ��Ʈ��ũ �� ##########\n");
		for (int i = 0; i < 30; i++) {
			n1[i] = new Network(i + 1);
			n1[i].report_card();
		}
		System.out.println("\n########## �ӽŷ��� �� ##########\n");
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
//		System.out.printf("�̸� : %s, ���� : %d, ��� : %.2f\n", name, sum, avg);
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