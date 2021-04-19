package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를 수 있게 된다.
// 고르지 않으면 Object로 설정된다.
public class D02_JiphapQuiz<T> {

	/*
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set 타입으로 반환하는 메서드

	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set 타입으로 반환하는 메서드

	 	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set 타입으로 반환하는 메서드

	 */
	public static int plus(int a, int b) {
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();
		
		// 소문자로 시작하는 타입들(기본형)은 매개변수로 전달할 때 값을 복사하여 전달한다.
		int a = 20;
		int b = 30;
		
		System.out.println(plus(a, b));
		System.out.println("plus 후 a의 값 : " + a);
		
		// 대문자로 시작하는 타입들(참조형)은 매개변수로 전달할 때 주소를 복사하여 전달한다.
		Set<String> words1 = new HashSet<>();
		words1.add("철수");
		words1.add("영희");
		words1.add("흰둥이");
		words1.add("바둑이");
		
		ArrayList<String> words2 = new ArrayList<>();
		words2.add("백구");
		words2.add("짱구");
		words2.add("흰둥이");
		words2.add("바둑이");
		
		System.out.println("합집합 : " + jiphap.hap(words1, words2));
		System.out.println("교집합 : " + jiphap.gyo(words1, words2));
		System.out.println("차집합 : " + jiphap.cha(words1, words2));
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