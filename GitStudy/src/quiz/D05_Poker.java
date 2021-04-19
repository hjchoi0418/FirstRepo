package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class D05_Poker {

	/*
	 * ��Ŀ�� �����غ�����
	 * 
	 * 1. �ξ� �÷���(Royal Flush a.k.a ��Ƽ��) ���� ������ ī��� 10,J,Q,K,A�� ������ ������ ���̵�
	 * 
	 * 2. ��Ʈ����Ʈ �÷���(Straight Flush a.k.a ��Ƽ��) ���� ���̷� 5���� ���ӵ� ī�带 ������ ������ ���̵�
	 * 
	 * 3. ��ī��(Four of a kind) ���� ������ ī�带 4�� ������ ������ ���̵�
	 * 
	 * 4. Ǯ�Ͽ콺(Full House) Ʈ���ð� �Բ� �ϳ��� �� ������ ������ ���̵� ���� ��ŷ�� ��� Ʈ������ ���ڰ� ���� �÷��̾ �¸�
	 * 
	 * 5. �÷���(Flush) ���� ������ ī�带 5�� ������ ������ ���̵� ���� ��ŷ�� ��� ���� ���� ���ڸ� ������ �÷��̾ �¸�
	 * 
	 * 6. ��Ʈ����Ʈ(Straight) ���ӵ� 5���� ī�带 ������ ������ ���̵� A(Ace)�� ���� 10,J,Q,K,A�� A,2,3,4,5��
	 		���� ������ ��� ��Ʈ����Ʈ���� ���� ���� ����̰�, ������ ��찡 ���� ���� ���
	 * 
	 * 7. ���� ���� �� ī�ε�(Three of a kind a.k.a Ʈ����) ���� ������ ī�带 3�� ������ ������ ���̵�
	 * 
	 * 8. �����(Two Pair) ���� ������ ī�� 2���� 2�� �����ϰ� ������ ���̵�
	 * 
	 * 9. �����(One Pair) ���� ������ ī�� 2���� 1�� �����ϰ� ������ ���̵�
	 * 
	 * 10. ����ī��(High Card) �ƹ��� �� ���� ������ �ִ� ������ ���� ���� ��ġ�� ī��
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
				System.out.println("##### Player1 ���� ī�� #####");
				System.out.println(p1Cards);
				System.out.println("--------------------------------");
				try {
					System.out.printf("Player1 ���� ī�� ���� (1 ~ %d) >> ", p1Cards.size());
					input = sc.nextInt();
					p1Cards.remove(input - 1);
					break;
				} catch (InputMismatchException e) {
					System.out.println("�ùٸ� ���� �Է��ϼ���");
					sc = new Scanner(System.in);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("�ùٸ� ���� �Է��ϼ���");
					sc = new Scanner(System.in);
				}
			}
			System.out.println("##### Player1 ���� ī�� #####");
			System.out.println(p1Cards);
			System.out.println("--------------------------------");
			
			while (true) {
				System.out.println("##### Player2 ���� ī�� #####");
				System.out.println(p2Cards);
				System.out.println("--------------------------------");
				try {
					System.out.printf("Player2 ���� ī�� ���� (1 ~ %d) >> ", p2Cards.size());
					input = sc.nextInt();
					p2Cards.remove(input - 1);
					break;
				} catch (InputMismatchException e) {
					System.out.println("�ùٸ� ���� �Է��ϼ���");
					sc = new Scanner(System.in);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("�ùٸ� ���� �Է��ϼ���");
					sc = new Scanner(System.in);
				}
			}
			System.out.println("##### Player2 ���� ī�� #####");
			System.out.println(p2Cards);
			System.out.println("--------------------------------");
		}
		
		System.out.println("##### Player1 ���� ī�� #####");
		System.out.println(p1Cards);
		p1Score = check(p1Cards);
		
		System.out.println("##### Player2 ���� ī�� #####");
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
				System.out.println("�����ϴ�.");
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
				System.out.println("�ξ� ��Ʈ����Ʈ �÷���!");
				return 10;
			} else if (first.number + 1 == second.number && second.number + 1 == third.number
					&& third.number + 1 == fourth.number && fourth.number + 1 == fifth.number) {
				System.out.println("��Ʈ����Ʈ �÷���!");
				return 9;
			}
		} else if (first.number == fourth.number || second.number == fifth.number) {
			System.out.println("�� ī��!");
			return 8;
		} else if ((first.number == second.number && third.number == fifth.number) ||
				(first.number == third.number && fourth.number == fifth.number)) {
			System.out.println("Ǯ �Ͽ콺!");
			return 7;
		} else if (shapeSorted.get(0).shape == shapeSorted.get(4).shape) {
			System.out.println("�÷���!");
			return 6;
		} else if ((first.number + 1 == second.number && second.number + 1 == third.number
				&& third.number + 1 == fourth.number && fourth.number + 1 == fifth.number) ||
				(first.cardNum.equals("A") && second.cardNum.equals("10") && third.cardNum.equals("J") &&
						fourth.cardNum.equals("Q") && fifth.cardNum.equals("K"))) {
			System.out.println("��Ʈ����Ʈ!");
			return 5;
		} else if (first.number == third.number || second.number == fourth.number || third.number == fifth.number) {
			System.out.println("Ʈ����!");
			return 4;
		} else if ((first.number == second.number && third.number == fourth.number) ||
				(first.number == second.number && fourth.number == fifth.number)||
				(second.number == third.number && fourth.number == fifth.number)) {
			System.out.println("�� ���!");
			return 3;
		} else if (first.number == second.number || second.number == third.number ||
				third.number == fourth.number || fourth.number == fifth.number) {
			System.out.println("�� ���!");
			return 2;
		} else {
			System.out.println("���� ī��!");
			return 1;
		}
		return 0;
	}
}

class Card {
	private static String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private static String[] shapeNames = { "��", "��", "��", "��" };

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