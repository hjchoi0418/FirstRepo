package myinterface;

public class Tank implements Car, Cannon {

	boolean powerOn;
	boolean reloaded;
	
	@Override
	public void startUp() {
		if (powerOn) {
			System.out.println("시동을 끕니다.");
			powerOn = false;
		} else {
			System.out.println("시동을 켭니다.");
			powerOn = true;
		}
	}
	@Override
	public void reload() {
		if (reloaded)
			System.out.println("이미 장전되었습니다.");
		else {
			System.out.println("포탄 장전!");
			reloaded = true;
		}
	}
	@Override
	public void fire() {
		System.out.println("포탄을 발사합니다. 콰쾅ㅇ쾅콰오");
		reloaded = false;
	}
	public Tank() {
		this.powerOn = false;
		this.reloaded = false;
	}
	
	public static void main(String[] args) {
		Tank t = new Tank();
		t.startUp();
		t.drive();
		t.reload();
		t.reload();
		t.fire();
		t.startUp();
	}
}
