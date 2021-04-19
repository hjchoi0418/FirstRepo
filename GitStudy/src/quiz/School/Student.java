package quiz.School;

import java.util.Random;

public class Student {
	final static String[] lastNameList = {"강", "고", "구", "권", "김", "나", "박", "최", "오", "제갈", "독고", "이", "신", "차", "남궁", "배", "서", "안", "임"};
	final static String[] firstNameList = {"현준", "혁준", "재선", "세현", "재현", "태환", "태환", "현식", "혜승", "지혜", "예림", "우현", "승미", "광민", "병훈", "충민", "혜영", "승운", "은창", "준열", "상혁", "하진", "호륜"};
	
	Random ran = new Random();
	String name;
	String st_num;
	int korean;
	int english;
	
	public Student() {}
	
	public Student(int st_num) {
		this.name = getRandomName();
		korean = ran.nextInt(101);
		english = ran.nextInt(101);
		this.st_num = "S";
	}
	
	public void report_card() {}
	
	String getRandomName() {
		return lastNameList[ran.nextInt(lastNameList.length)] + firstNameList[ran.nextInt(firstNameList.length)];
	}
}