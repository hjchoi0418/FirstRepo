package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
		/*
		 	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요.
		 	
		 	* 필요없는 단위는 출력하지 말것
		 	* ex : 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
		 */
		Scanner sc = new Scanner(System.in);
		
		int year, day, hour, minute, second;
		System.out.print("초를 입력하세요. >> ");
		second = sc.nextInt();
		
		year = second / 31536000;
		day = second / 86400;
		hour = second / 3600;
		minute = second / 60;
		
		if (year > 0)
			System.out.print(year + "년 ");
		if (day > 0)
			System.out.print(day % 365 + "일 ");
		if (hour > 0)
			System.out.print(hour % 24 + "시간 ");
		if (minute > 0)
			System.out.print(minute % 60 + "분 ");
		if (second > 0)
			System.out.println(second % 60 + "초 ");
	}
	
}