package quiz.School;

import java.util.Random;

public class Student {
	final static String[] lastNameList = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "����", "����", "��", "��", "��", "����", "��", "��", "��", "��"};
	final static String[] firstNameList = {"����", "����", "�缱", "����", "����", "��ȯ", "��ȯ", "����", "����", "����", "����", "����", "�¹�", "����", "����", "���", "����", "�¿�", "��â", "�ؿ�", "����", "����", "ȣ��"};
	
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