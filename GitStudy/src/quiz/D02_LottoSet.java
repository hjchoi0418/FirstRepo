package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_LottoSet {

	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하여
	 	반환하는 메서드를 작성 후 테스트해보기
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(lottoSet());
		System.out.println(lottoAL());
//		System.out.println(lottoArr());
		
	}
	
	public static HashSet<Integer> lottoSet() {
		HashSet<Integer> lottoSet = new HashSet<>();
		int randNum;
		while (lottoSet.size() < 7) {
			randNum = (int) (Math.random() * 45 + 1);
			lottoSet.add(randNum);
		}
		
		return lottoSet;
	}
	/*
 		1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여
 		반환하는 메서드를 작성 후 테스트
	 */
	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 Integer[]을 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 */
	public static ArrayList lottoAL() {
		ArrayList<Integer> lottoAL = new ArrayList<>(lottoSet());
		
		return lottoAL;
	}
	
//	public static Integer[] lottoArr() {
//		
//		return lottoAL().toArray(new Integer[7]);
//	}
}
