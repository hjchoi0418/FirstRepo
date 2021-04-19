package myobj.item;

public class Snack extends Item {
	
	int fullness;
	int healthy;
	
	public Snack(String name, int price) {
		super(name, price);
		fullness = 20;
		healthy = 10;
	}
	
	public void use() {
		System.out.printf("%s를 먹어 포만감이 %d만큼 찼습니다.\n", this.name, fullness);
		System.out.printf("건강이 %d만큼 감소합니다.\n", healthy);
	}
}
