package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�.
// ���� ������ Object�� �����ȴ�.
public class D02_JiphapQuiz<T> {

	/*
	 	1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set Ÿ������ ��ȯ�ϴ� �޼���

	 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set Ÿ������ ��ȯ�ϴ� �޼���

	 	3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set Ÿ������ ��ȯ�ϴ� �޼���

	 */
	public static int plus(int a, int b) {
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();
		
		// �ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�.
		int a = 20;
		int b = 30;
		
		System.out.println(plus(a, b));
		System.out.println("plus �� a�� �� : " + a);
		
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�.
		Set<String> words1 = new HashSet<>();
		words1.add("ö��");
		words1.add("����");
		words1.add("�����");
		words1.add("�ٵ���");
		
		ArrayList<String> words2 = new ArrayList<>();
		words2.add("�鱸");
		words2.add("¯��");
		words2.add("�����");
		words2.add("�ٵ���");
		
		System.out.println("������ : " + jiphap.hap(words1, words2));
		System.out.println("������ : " + jiphap.gyo(words1, words2));
		System.out.println("������ : " + jiphap.cha(words1, words2));
	}
	
	public Set<T> hap(Collection<? extends T> c1, Collection<? extends T> c2) {
		Set<T> jiphap1 = new HashSet<>(c1);
		Set<T> jiphap2 = new HashSet<>(c2);
		jiphap1.addAll(jiphap2);
		return jiphap1;
	}
	
	public Set<T> gyo(Collection<? extends T> c1, Collection<? extends T> c2) {
		Set<T> jiphap1 = new HashSet<>(c1);
		Set<T> jiphap2 = new HashSet<>(c2);
		jiphap1.retainAll(jiphap2);
		return jiphap1;
	}
	
	public Set<T> cha(Collection<? extends T> c1, Collection<? extends T> c2) {
		Set<T> jiphap1 = new HashSet<>(c1);
		Set<T> jiphap2 = new HashSet<>(c2);
		jiphap1.removeAll(jiphap2);
		return jiphap1;
	}
}