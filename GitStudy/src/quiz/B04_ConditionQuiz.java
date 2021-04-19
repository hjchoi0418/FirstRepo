package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
		
		/*
        [ 알맞은 비교연산을 만들어보세요 ]
            
        1. int형 변수 a가 10보다 크고 20보다 작을 때 true
        2. int형 변수 b가 짝수일 때 true                
        3. int형 변수 c가 7의 배수일 때 true
        4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
        5. int형 변수 d와 e의 차이가 30일 때 true                
        6. int형 변수 year가 400으로 나누어 떨어지거나  
           또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
        7. 민수가 철수보다 2살 많으면 true
        8. 민수가 철수보다 생일이 3달 빠르면 true  
         9. boolean형 변수 powerOn이 false일 때 true
        10. 문자열 참조변수 str이 "yes"일 때 true
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
		
		// 문자열(참조형 타입)은 ==으로 비교하면 안된다.
		// 참조형 타입의 값을 비교할 때는 해당 클래스에 정의되어 있는 equals()라는
		// 메서드를 이용해야 한다.
		System.out.println("10. str == \"yes\" : " + (str == "yes"));
		
		// # 기본형 타입과 참조형 타입의 차이점
		//  - 기본 타입은 내부 데이터의 크기를 예측하기 쉽다. (차곡차곡 쌓이는 메모리를 사용한다, 스택(Stack))
		//  - 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다. (여기저기 막 쓰는 메모리를 사용한다, 힙(Heap))
		
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