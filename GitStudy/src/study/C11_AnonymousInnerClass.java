package study;

public class C11_AnonymousInnerClass {

	/*
	 	# 익명 내부 클래스
	 	
	 	 - 클래스에 이름을 짓지 않고 구현한 다음 바로 사용하는 방식
	 	 - 일회용이다.
	 */
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("메시"));
		kick(new Ball("기성용"));
		
		class Door extends Kickable {
			
			boolean open;
			
			@Override
			void kick() {
				if (open) {
					System.out.println("문짝을 발로 차서 닫았습니다.");
					open = false;
				} else {
					System.out.println("문짝을 발로 차서 열었습니다.");
					open = true;
				}
			}
		}
		
		Door door1 = new Door(), door2 = new Door(), door3 = new Door();
		
		kick(door1);
		kick(door1);
		kick(door1);
		kick(door2);
		kick(door3);
		kick(door3);
		
		// # 익명 클래스 (즉석에서 Door를 상속한 인스턴스를 생성)
		//  - 만들고 따로 저장하지 않기 때문에 다시는 사용할 수 없다. (일회용)
		kick(new Door() {
			@Override
			void kick() {
				System.out.println("튼튼한 금고 문이 무거워서 꿈쩍도 하지 않았습니다.");
			}
		});
		
		kick(new Ball() {
			@Override
			void kick() {
				System.out.println("농구공을 발로 찼더니 멀리 나가지는 않고 아프기만 합니다.");
			}
		});
		System.out.println();
		
		// punch() 메서드의 인자값으로 전달할 수 있는
		// 익명 클래스로 2개, 지역 내부 클래스로 2개를 만들어서 전달해보세요.
		
		class Tree extends Punchable{
			int fruit;
			
			@Override
			void punch() {
				System.out.println("나무를 쳐서 나무열매가 떨어집니다.");
			}
		}
		
		class PunchingMachine extends Punchable {
			int score;
			
			@Override
			void punch() {
				score = (int)(Math.random() * 201);
				System.out.println("펀칭머신을 쳐서 점수가 " + score + "만큼 나왔습니다.");
			}
		}
		
		punch(new Tree());
		punch(new PunchingMachine());
		
		punch(new Wall());
		punch(new Monitor());
		Monitor m = new Monitor();
		m.buyMonitor();
		punch(m);
		punch(m);
	}
	
	public static void punch(Punchable something) {
		something.punch();
	}
}

abstract class Punchable {
	abstract void punch();
}

class Wall extends Punchable {
	@Override
	void punch() {
		System.out.println("벽을 쳐서 손이 아픕니다.");
	}
}

class Monitor extends Punchable {
	boolean hasMonitor;
	
	@Override
	void punch() {
		if (hasMonitor)
			System.out.println("모니터를 주먹으로 쳐서 부쉈습니다.");
		else
			System.out.println("부술 모니터가 없습니다.");
	}
	
	void buyMonitor() {
		System.out.println("모니터를 새로 샀습니다.");
		hasMonitor = true;
	}
}

abstract class Kickable {
	abstract void kick();
}

class Ball extends Kickable {
	
	String kicker;
	
	public Ball() {
		
	}
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	@Override
	void kick() {
		if (kicker.equals("메시")) {
			System.out.println("슛을 멋있게 찼습니다.");
		} else if (kicker.equals("기성용")) {
			System.out.println("패스를 정확하게 찼습니다.");
		}
	}
}

class Human extends Kickable {
	@Override
	void kick() {
		System.out.println("사람을 발로 걷어찼습니다.");
	}
}

class VendingMachine extends Kickable {
	@Override
	void kick() {
		System.out.println("자판기를 걷어찼더니 음료수가 하나 나왔습니다.");
	}
}