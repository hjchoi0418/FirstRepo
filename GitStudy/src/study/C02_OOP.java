package study;
import myobj.Peach;
import myobj.Water;

public class C02_OOP {

	/*
	 	# ��ü���� ���α׷��� (OOP : Object Oriented Programming)
	 	
	 	 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 	 - ������ �Լ��� ���к��ϰ� �����ϱ� ���ٴ�
	 	 	���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���.
	 	 - 
	 	 
	 	ex : ���
	 	 - ����� ���� : ũ��, ����, �絵, �������, ������ Į�θ� ...
	 	 - ����� �޼���
	 	 	-> ������ (ũ�� ��ŭ�� ������� ������.)
	 	 	-> �Դ´� (���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���.)
	 	 	-> �����Ѵ� (����� �����ϸ� ��������� ������ �����Ѵ�.)
	 	 
	 	 �� Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ���. (��� JAVA���� �޼��� �ۿ� ����.)
	 	 
	 	 # Ŭ���� (Class)
	 	 
	 	  - ��ü�� ���α׷��� ���� ǥ���� ��
	 	  - Ŭ������ ��ü�� ���赵�̴�. (������ ���������� ��ü�� ����)
	 	  - Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���.
	 */
	
	// ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�.
	public static void main(String[] args) {
		
		// Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) a1
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		
		String str1 = "abc";
		String str2 = "ccc";
		String str3 = "bb";
		
		/*
		 	myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
		 	�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����.
		 	
		 	�� �ν��Ͻ� ���� 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
		 */
		Water w1 = new Water();
		
		w1.temperature = 10.0;
		w1.purity = 100;
		w1.state = "water";
		
		System.out.printf("���� �µ� : %.2f��, ���� : %d, ���� : %s\n", w1.temperature, w1.purity, w1.state);
		
		for (int i = 0; i < 15; i++)
			w1.freeze();
		
		System.out.printf("���� �µ� : %.2f��, ���� : %d, ���� : %s\n", w1.temperature, w1.purity, w1.state);

	}
}

// default class (public�� �� ���� class)
class Apple {
	/*
	 	# �ν��Ͻ� ����
	 	 - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	 	 - aka �ʵ�, �Ӽ�, ��� ����, ���� ...
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	/*
	 	# �ν��Ͻ� �޼���
	 	 - �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}