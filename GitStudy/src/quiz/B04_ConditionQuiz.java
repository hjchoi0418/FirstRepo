package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
		
		/*
        [ �˸��� �񱳿����� �������� ]
            
        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
        2. int�� ���� b�� ¦���� �� true                
        3. int�� ���� c�� 7�� ����� �� true
        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
        5. int�� ���� d�� e�� ���̰� 30�� �� true                
        6. int�� ���� year�� 400���� ������ �������ų�  
           �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
        7. �μ��� ö������ 2�� ������ true
        8. �μ��� ö������ ������ 3�� ������ true  
         9. boolean�� ���� powerOn�� false�� �� true
        10. ���ڿ� �������� str�� "yes"�� �� true
		 */
		
		int a, b, c, d, e, hour, year, minsuAge, chulsuAge, minsuBirth, chulsuBirth;
		boolean powerOn;
		String str;
		a = 15;
		b = 4;
		c = 14;
		hour = 18;
		d = 30;
		e = 60;
		year = 400;
		minsuAge = 13;
		chulsuAge = 11;
		minsuBirth = 9;
		chulsuBirth = 12;
		powerOn = false;
		str = "yes";
		
		
		System.out.println("1. a > 10 && a < 20 : " + (a > 10 && a < 20));
		System.out.println("2. b != 0 && b % 2 == 0 : " + (b != 0 && b % 2 == 0));
		System.out.println("3. c % 7 == 0 : " + (c % 7 == 0));
		System.out.println("4. !(hour < 0 || hour >= 24) && hour >= 12 : " + (!(hour < 0 || hour >= 24) && hour >= 12));
		System.out.println("5. Math.abs(d - e) == 30 : " + (Math.abs(d - e) == 30));
		System.out.println("6. year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) : " +
							(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("7. minsuAge == chulsuAge + 2 : " + (minsuAge == chulsuAge + 2));
		System.out.println("8. chulsuBirth - minsuBirth == 3 : " + (chulsuBirth - minsuBirth == 3));
		System.out.println("9. powerOn == false : " + (powerOn == false));
		
		// ���ڿ�(������ Ÿ��)�� ==���� ���ϸ� �ȵȴ�.
		// ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ� equals()���
		// �޼��带 �̿��ؾ� �Ѵ�.
		System.out.println("10. str == \"yes\" : " + (str == "yes"));
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ������
		//  - �⺻ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����. (�������� ���̴� �޸𸮸� ����Ѵ�, ����(Stack))
		//  - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�. (�������� �� ���� �޸𸮸� ����Ѵ�, ��(Heap))
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
	}
}