package myobj.item;

public class Hamberger extends Item {
	
	int fullness;
	
	public Hamberger(String name, int price) {
		super(name, price);
		fullness = 30;
	}
	
	public void use() {
		System.out.printf("%s�� �Ծ� �������� %d��ŭ á���ϴ�.\n", this.name, fullness);
	}
}
