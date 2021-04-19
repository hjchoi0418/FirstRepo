package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	/*
	 	어떤 카페에서 짝수번째 목요일 마다 할인행사를 진행한다고 가정할 때
	 	년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요.
	 */
	
	// ※ Calendar 클래스는 어떤 필드를 변경하면 나머지 필드도 상황에 맞게 알아서 업데이트 된다.
	public static void main(String[] args) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy년 M월 d일");
		
		Scanner sc = new Scanner(System.in);
		int year = 2021;
		int count = 1;
		
//		System.out.print("년도를 입력하면 할인행사 날짜를 구합니다. >> ");
//		getDCday(sc.nextInt());
		
		Calendar event = Calendar.getInstance();
		
		event.set(year,  0, 1, 0, 0, 0);
		
//		for (int i = 0; i < 12; i++) {
		while (event.get(Calendar.YEAR)== year) {
//			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); // 목요일로 바꾸고
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2); // 이번 달 두 번째 요일로 변경
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d번째 행사]\n", count++);
			
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4); // 이번 달 네 번째 요일로 변경
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d번째 행사]\n", count++);
			
			// add() : 원하는 필드를 원하는 수치만큼 더하거나 뺄 수 있다.
			event.add(Calendar.MONTH, 1);
		}
	}
	
	public static void getDCday(int input) {
		Calendar cafeCalendar = Calendar.getInstance();
		int dow;
		int dowim;
		
		cafeCalendar.set(Calendar.YEAR, input);
		
		System.out.println("#### 행사일 ####");
		
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
