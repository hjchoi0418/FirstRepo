package study;
import myobj.Peach;
import myobj.Water;

public class C02_OOP {

	/*
	 	# 객체지향 프로그래밍 (OOP : Object Oriented Programming)
	 	
	 	 - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
	 	 - 변수와 함수를 무분별하게 ㅏ용하기 보다는
	 	 	현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다.
	 	 - 
	 	 
	 	ex : 사과
	 	 - 사과의 변수 : 크기, 색깔, 당도, 유통기한, 보유한 칼로리 ...
	 	 - 사과의 메서드
	 	 	-> 던진다 (크기 만큼의 대미지를 입힌다.)
	 	 	-> 먹는다 (먹은 만큼 칼로리가 줄어들고 사과의 크기가 줄어든다.)
	 	 	-> 보관한다 (냉장고에 보관하면 유통기한이 느리게 감소한다.)
	 	 
	 	 ※ 클래스 내부에 있는 함수를 메서드라고 부른다. (사실 JAVA에는 메서드 밖에 없다.)
	 	 
	 	 # 클래스 (Class)
	 	 
	 	  - 객체를 프로그래밍 언어로 표현한 것
	 	  - 클래스는 객체의 설계도이다. (정의한 시점에서는 실체가 없음)
	 	  - 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다.
	 */
	
	// 프로그램 실행 시에 public class에 있는 main만 찾을 수 있다.
	public static void main(String[] args) {
		
		// Apple 클래스(설계도)로 만들어낸 인스턴스(생산품) a1
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
		 	myobj 패키지에 현실의 객체를 참조하여 클래스를 하나 생성한 후
		 	인스턴스를 생성하고 값을 채운다음 출력해보세요.
		 	
		 	※ 인스턴스 변수 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지
		 */
		Water w1 = new Water();
		
		w1.temperature = 10.0;
		w1.purity = 100;
		w1.state = "water";
		
		System.out.printf("물의 온도 : %.2f℃, 순도 : %d, 상태 : %s\n", w1.temperature, w1.purity, w1.state);
		
		for (int i = 0; i < 15; i++)
			w1.freeze();
		
		System.out.printf("물의 온도 : %.2f℃, 순도 : %d, 상태 : %s\n", w1.temperature, w1.purity, w1.state);

	}
}

// default class (public이 안 붙은 class)
class Apple {
	/*
	 	# 인스턴스 변수
	 	 - 각 인스턴스마다 다른 값을 가질 수 있는 변수
	 	 - aka 필드, 속성, 멤버 변수, 상태 ...
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	/*
	 	# 인스턴스 메서드
	 	 - 인스턴스 변수를 활용하여 해당 인스턴스의 상태를 변화시키는 메서드
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}