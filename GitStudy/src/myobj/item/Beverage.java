package myobj.item;

public class Beverage extends Item {

	int thirsty;
	
	public Beverage(String name, int price) {
		super(name, price);
		thirsty = 20;
	}
	
	public void use() {
		System.out.printf("%s�� ���ż� ������ %d��ŭ �ؼҵǾ����ϴ�.\n", this.name, thirsty);
	}
}
