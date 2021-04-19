package myobj;

public class ShortSword {
	static int atk = 10;
	static int str_require = 20;
	public int durability;
	
	public ShortSword() {
		this.durability = (int)(Math.random() * 100) + 1;
	}
	
	public void attack() {
		System.out.println("АјАн!!");
		this.durability--;
	}
}