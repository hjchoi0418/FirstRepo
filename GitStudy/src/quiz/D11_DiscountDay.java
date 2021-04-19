package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	/*
	 	� ī�信�� ¦����° ����� ���� ������縦 �����Ѵٰ� ������ ��
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����.
	 */
	
	// �� Calendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ �ȴ�.
	public static void main(String[] args) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy�� M�� d��");
		
		Scanner sc = new Scanner(System.in);
		int year = 2021;
		int count = 1;
		
//		System.out.print("�⵵�� �Է��ϸ� ������� ��¥�� ���մϴ�. >> ");
//		getDCday(sc.nextInt());
		
		Calendar event = Calendar.getInstance();
		
		event.set(year,  0, 1, 0, 0, 0);
		
//		for (int i = 0; i < 12; i++) {
		while (event.get(Calendar.YEAR)== year) {
//			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); // ����Ϸ� �ٲٰ�
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2); // �̹� �� �� ��° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
			
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4); // �̹� �� �� ��° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
			
			// add() : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �� �� �ִ�.
			event.add(Calendar.MONTH, 1);
		}
	}
	
	public static void getDCday(int input) {
		Calendar cafeCalendar = Calendar.getInstance();
		int dow;
		int dowim;
		
		cafeCalendar.set(Calendar.YEAR, input);
		
		System.out.println("#### ����� ####");
		
		for (int i = 0; i <= cafeCalendar.getActualMaximum(Calendar.MONTH); i++) {
			cafeCalendar.set(Calendar.MONTH, i);
			for (int j = 1; j <= cafeCalendar.getActualMaximum(Calendar.DATE); j++) {
				cafeCalendar.set(Calendar.DATE, j);
				
				dow = cafeCalendar.get(Calendar.DAY_OF_WEEK);
				dowim = cafeCalendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
				
				if (dow == Calendar.THURSDAY && dowim % 2 == 0) {
					System.out.printf("%d/%02d/%02d\n",
							cafeCalendar.get(Calendar.YEAR),
							cafeCalendar.get(Calendar.MONTH) + 1,
							cafeCalendar.get(Calendar.DATE));
				}
			}
		}
	}
}
