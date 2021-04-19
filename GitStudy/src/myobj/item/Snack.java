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
		System.out.printf("%s�� �Ծ� �������� %d��ŭ á���ϴ�.\n", this.name, fullness);
		System.out.printf("�ǰ��� %d��ŭ �����մϴ�.\n", healthy);
	}
}
