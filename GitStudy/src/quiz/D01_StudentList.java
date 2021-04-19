package quiz;

import java.util.ArrayList;
import java.util.Iterator;

public class D01_StudentList {

	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����.
	 	
	 		1. �� �л��� ������ �������� �����˴ϴ�.
	 		
	 		2. ������ ��/��/�� �ۿ� �����ϴ�.
	 		
	 		3. 30���� ����� ������ּ���.
	 		
	 		4. 30���� ���� ������ ���� �л��� �̸��� ������ ������ּ���.
	 		
	 		5. �̸��� ������ ���� �����˴ϴ�.
	 		
	 				�л�000000
	 				�л�000001
	 				�л�000002
	 				...
	 */
	
	public static void main(String[] args) {
		
		double max = 0;
		int best = 0;
		ArrayList<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			students.add(new Student(stName(i)));
			System.out.printf("%s�� ��� : %.2f\n", students.get(i).name, students.get(i).getAvg());
			if (max < students.get(i).sum) {
				max = students.get(i).sum;
				best = i;
			}
		}
		System.out.print("\n#### �ֿ�� ���� �л� ####\n");
		students.get(best).printScore();
	}
	
	public static String stName(int num) {
//		StringBuilder sb = new StringBuilder();
//		int zero;
//		
//		sb.append("�л�");
//		if (num >= 100000)
//			zero = 0;
//		else if (num >= 10000)
//			zero = 1;
//		else if (num >= 1000)
//			zero = 2;
//		else if (num >= 100)
//			zero = 3;
//		else if (num >= 10)
//			zero = 4;
//		else
//			zero = 5;
//		
//		for(int i = 0; i < zero; i++)
//			sb.append("0");
//		
//		sb.append(num);
		
		return String.format("�л�%06d", num);
	}
}

class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public Student(String name) {
		this.name = name;
		this.kor = (int) (Math.random() * 101);
		this.eng = (int) (Math.random() * 101);
		this.math = (int) (Math.random() * 101);
		this.sum = kor + eng + math;
		this.avg = sum / 3.0;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void printScore() {
		System.out.printf("�̸� : %s, ���� : %d, ���� : %d, ���� : %d\n", name, kor, eng, math);
	}
}