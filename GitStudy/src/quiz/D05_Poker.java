package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class D05_Poker {

	/*
	 * 포커를 구현해보세요
	 * 
	 * 1. 로얄 플러쉬(Royal Flush a.k.a 로티플) 같은 무늬의 카드로 10,J,Q,K,A를 가지고 있으면 메이드
	 * 
	 * 2. 스트레이트 플러쉬(Straight Flush a.k.a 스티플) 같은 무늬로 5장의 연속된 카드를 가지고 있으면 메이드
	 * 
	 * 3. 포카드(Four of a kind) 같은 숫자의 카드를 4장 가지고 있으면 메이드
	 * 
	 * 4. 풀하우스(Full House) 트리플과 함께 하나의 페어를 가지고 있으면 메이드 같은 랭킹일 경우 트리플의 숫자가 높은 플레이어가 승리
	 * 
	 * 5. 플러쉬(Flush) 같은 무늬의 카드를 5장 가지고 있으면 메이드 같은 랭킹일 경우 가장 높은 숫자를 보유한 플레이어가 승리
	 * 
	 * 6. 스트레이트(Straight) 연속된 5장의 카드를 가지고 있으면 메이드 A(Ace)의 경우는 10,J,Q,K,A와 A,2,3,4,5가
	 		가능 전자의 경우 스트레이트에서 가장 높은 등급이고, 후자의 경우가 가장 낮은 등급
	 * 
	 * 7. 쓰리 오브 어 카인드(Three of a kind a.k.a 트리플) 같은 숫자의 카드를 3장 가지고 있으면 메이드
	 * 
	 * 8. 투페어(Two Pair) 같은 숫자의 카드 2장을 2개 보유하고 있으면 메이드
	 * 
	 * 9. 원페어(One Pair) 같은 숫자의 카드 2장을 1개 보유하고 있으면 메이드
	 * 
	 * 10. 하이카드(High Card) 아무런 페어가 없이 가지고 있는 숫자중 가장 높은 수치의 카드
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1Score, p2Score;

		LinkedList<Card> deck = new LinkedList<>();
		ArrayList<Card> p1Cards = new ArrayList<>();
		ArrayList<Card> p2Cards = new ArrayList<>();

		int input;

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				deck.add(new Card(i, j));
			}
		}

		for (int i = 0; i < 7; i++) {
			p1Cards.add(deck.remove((int) (Math.random() * deck.size())));
			p2Cards.add(deck.remove((int) (Math.random() * deck.size())));
		}

		for (int i = 0; i < 2; i++) {
			while (true) {
				System.out.println("##### Player1 현재 카드 #####");
				System.out.println(p1Cards);
				System.out.println("--------------------------------");
				try {
					System.out.printf("Player1 버릴 카드 선택 (1 ~ %d) >> ", p1Cards.size());
					input = sc.nextInt();
					p1Cards.remove(input - 1);
					break;
				} catch (InputMismatchException e) {
					System.out.println("올바른 값을 입력하세요");
					sc = new Scanner(System.in);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("올바른 값을 입력하세요");
					sc = new Scanner(System.in);
				}
			}
			System.out.println("##### Player1 현재 카드 #####");
			System.out.println(p1Cards);
			System.out.println("--------------------------------");
			
			while (true) {
				System.out.println("##### Player2 현재 카드 #####");
				System.out.println(p2Cards);
				System.out.println("--------------------------------");
				try {
					System.out.printf("Player2 버릴 카드 선택 (1 ~ %d) >> ", p2Cards.size());
					input = sc.nextInt();
					p2Cards.remove(input - 1);
					break;
				} catch (InputMismatchException e) {
					System.out.println("올바른 값을 입력하세요");
					sc = new Scanner(System.in);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("올바른 값을 입력하세요");
					sc = new Scanner(System.in);
				}
			}
			System.out.println("##### Player2 현재 카드 #####");
			System.out.println(p2Cards);
			System.out.println("--------------------------------");
		}
		
		System.out.println("##### Player1 현재 카드 #####");
		System.out.println(p1Cards);
		p1Score = check(p1Cards);
		
		System.out.println("##### Player2 현재 카드 #####");
		System.out.println(p2Cards);
		p2Score = check(p2Cards);
		
		if (p1Score > p2Score) {
			System.out.println("Player1 Win!!");
		} else if (p1Score < p2Score) {
			System.out.println("Player2 Win!!");
		} else {
			int p1Sum = 0, p2Sum = 0;
			for (int i = 0; i < 5; i++) {
				p1Sum += p1Cards.get(i).number;
				p2Sum += p2Cards.get(i).number;
			}
			
			if (p1Sum > p2Sum) {
				System.out.println("Player1 Win!!");
			} else if (p1Sum < p2Sum) {
				System.out.println("Player2 Win!!");
			} else {
				System.out.println("비겼습니다.");
			}
		}
	}

	public static int check(ArrayList<Card> arrList) {
		
		ArrayList<Card> numSorted = new ArrayList<>(arrList);
		ArrayList<Card> shapeSorted = new ArrayList<>(arrList);

		Collections.sort(numSorted, new CardNumberCompare());
		Collections.sort(shapeSorted, new CardShapeCompare());
		
		Card first = numSorted.get(0);
		Card second = numSorted.get(1);
		Card third = numSorted.get(2);
		Card fourth = numSorted.get(3);
		Card fifth = numSorted.get(4);

		if (shapeSorted.get(0).shape == shapeSorted.get(4).shape) {
			if (first.cardNum.equals("A") && second.cardNum.equals("10") && third.cardNum.equals("J") && fourth.cardNum.equals("Q")
					&& fifth.cardNum.equals("K")) {
				System.out.println("로얄 스트레이트 플러쉬!");
				return 10;
			} else if (first.number + 1 == second.number && second.number + 1 == third.number
					&& third.number + 1 == fourth.number && fourth.number + 1 == fifth.number) {
				System.out.println("스트레이트 플러쉬!");
				return 9;
			}
		} else if (first.number == fourth.number || second.number == fifth.number) {
			System.out.println("포 카드!");
			return 8;
		} else if ((first.number == second.number && third.number == fifth.number) ||
				(first.number == third.number && fourth.number == fifth.number)) {
			System.out.println("풀 하우스!");
			return 7;
		} else if (shapeSorted.get(0).shape == shapeSorted.get(4).shape) {
			System.out.println("플러쉬!");
			return 6;
		} else if ((first.number + 1 == second.number && second.number + 1 == third.number
				&& third.number + 1 == fourth.number && fourth.number + 1 == fifth.number) ||
				(first.cardNum.equals("A") && second.cardNum.equals("10") && third.cardNum.equals("J") &&
						fourth.cardNum.equals("Q") && fifth.cardNum.equals("K"))) {
			System.out.println("스트레이트!");
			return 5;
		} else if (first.number == third.number || second.number == fourth.number || third.number == fifth.number) {
			System.out.println("트리플!");
			return 4;
		} else if ((first.number == second.number && third.number == fourth.number) ||
				(first.number == second.number && fourth.number == fifth.number)||
				(second.number == third.number && fourth.number == fifth.number)) {
			System.out.println("투 페어!");
			return 3;
		} else if (first.number == second.number || second.number == third.number ||
				third.number == fourth.number || fourth.number == fifth.number) {
			System.out.println("원 페어!");
			return 2;
		} else {
			System.out.println("하이 카드!");
			return 1;
		}
		return 0;
	}
}

class Card {
	private static String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private static String[] shapeNames = { "♣", "♥", "◆", "♠" };

	int number;
	int shape;
	String cardNum;
	String shapeName;

	Card(int number, int shape) {
		this.number = number;
		this.shape = shape;
		this.shapeName = shapeNames[shape];
		this.cardNum = numbers[number];
	}

	@Override
	public String toString() {
		return String.format("%s/%s", shapeName, cardNum);
	}
}

class CardNumberCompare implements Comparator<Card> {
	@Override
	public int compare(Card o1, Card o2) {
		if (o1.number < o2.number)
			return -1;
		else if (o1.number > o2.number)
			return 1;
		else
			return 0;
	}
}

class CardShapeCompare implements Comparator<Card> {
	@Override
	public int compare(Card o1, Card o2) {
		if (o1.shape < o2.shape)
			return -1;
		else if (o1.shape > o2.shape)
			return 1;
		else
			return 0;
	}
}