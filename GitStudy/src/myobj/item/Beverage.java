package myobj.item;

public class Beverage extends Item {

	int thirsty;
	
	public Beverage(String name, int price) {
		super(name, price);
		thirsty = 20;
	}
	
	public void use() {
		System.out.printf("%s를 마셔서 갈증이 %d만큼 해소되었습니다.\n", this.name, thirsty);
	}
}
