package quiz;

import java.util.ArrayList;
import java.util.Iterator;

public class D01_StudentList {

	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요.
	 	
	 		1. 각 학생의 점수는 랜덤으로 설정됩니다.
	 		
	 		2. 과목은 국/영/수 밖에 없습니다.
	 		
	 		3. 30명의 평균을 출력해주세요.
	 		
	 		4. 30명중 가장 총점이 높은 학생의 이름과 성적을 출력해주세요.
	 		
	 		5. 이름은 다음과 같이 생성됩니다.
	 		
	 				학생000000
	 				학생000001
	 				학생000002
	 				...
	 */
	
	public static void main(String[] args) {
		
		double max = 0;
		int best = 0;
		ArrayList<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			students.add(new Student(stName(i)));
			System.out.printf("%s의 평균 : %.2f\n", students.get(i).name, students.get(i).getAvg());
			if (max < students.get(i).sum) {
				max = students.get(i).sum;
				best = i;
			}
		}
		System.out.print("\n#### 최우수 성적 학생 ####\n");
		students.get(best).printScore();
	}
	
	public static String stName(int num) {
//		StringBuilder sb = new StringBuilder();
//		int zero;
//		
//		sb.append("학생");
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
		
		return String.format("학생%06d", num);
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
		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n", name, kor, eng, math);
	}
}