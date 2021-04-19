package quiz;

import java.time.LocalDate;
import java.util.ArrayList;

import myobj.Car;

public class D13_FivePartSystem {
	
	public static boolean pass(LocalDate day, Car car) {
		System.out.printf("차량번호 : %d, ", car.getNum());
		
		if (isHoliday(day) || day.getDayOfWeek().getValue() > 5) {
			System.out.println("출입제한 적용제외일입니다.");
			return true;
		} else if (car.isLightCar() || car.isDisabled() || car.hasChildCompanion()) {
			System.out.println("출입제한 제외차량입니다.");
			return true;
		} else if (car.getNum() % 5 == day.getDayOfWeek().getValue()) {
			System.out.println("출입제한 차량입니다. 출입이 통제됩니다.");
			return false;
		}
		System.out.println("출입 가능한 차량입니다.");
		return true;
	}
	
	public static boolean isHoliday(LocalDate day) {
		ArrayList<LocalDate> holidays = new ArrayList<>();
		
		holidays.add(LocalDate.of(2021, 1, 1));
		holidays.add(LocalDate.of(2021, 2, 11));
		holidays.add(LocalDate.of(2021, 2, 12));
		holidays.add(LocalDate.of(2021, 2, 13));
		holidays.add(LocalDate.of(2021, 2, 14));
		holidays.add(LocalDate.of(2021, 3, 1));
		holidays.add(LocalDate.of(2021, 5, 5));
		holidays.add(LocalDate.of(2021, 5, 19));
		holidays.add(LocalDate.of(2021, 6, 6));
		holidays.add(LocalDate.of(2021, 8, 15));
		holidays.add(LocalDate.of(2021, 9, 20));
		holidays.add(LocalDate.of(2021, 9, 21));
		holidays.add(LocalDate.of(2021, 9, 22));
		holidays.add(LocalDate.of(2021, 10, 3));
		holidays.add(LocalDate.of(2021, 10, 9));
		holidays.add(LocalDate.of(2021, 12, 25));
		
		for (LocalDate holiday : holidays) {
			if (holiday.getMonthValue() == day.getMonthValue() && holiday.getDayOfMonth() == day.getDayOfMonth())
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.printf("%s %s\n", today, today.getDayOfWeek());
		
		Car matiz = new Car(3456, false, false, true);
		Car avante = new Car(3456, false, false, false);
		Car sonata = new Car(4567, false, false, false);
		
		pass(today, matiz);
		pass(today, avante);
		pass(today, sonata);
	}
}
