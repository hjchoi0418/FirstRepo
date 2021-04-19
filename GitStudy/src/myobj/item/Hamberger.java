package myobj.item;

public class Hamberger extends Item {
	
	int fullness;
	
	public Hamberger(String name, int price) {
		super(name, price);
		fullness = 30;
	}
	
	public void use() {
		System.out.printf("%s를 먹어 포만감이 %d만큼 찼습니다.\n", this.name, fullness);
	}
}
