package myobj;

import myobj.item.Candy;
import myobj.item.Inventory;

public class Peach {
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;

	public void eat() {
		size--;
		calorie -= 10;
	}
	
	public static void main(String[] args) {
		Candy candy = new Candy("È£¿Ã½º", 1500);
		Inventory inven1 = new Inventory(3);
	}
}