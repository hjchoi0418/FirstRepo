package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_LottoSet {

	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� HashSet�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
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
 		1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ�
 		��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	 */
	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� Integer[]�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
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
