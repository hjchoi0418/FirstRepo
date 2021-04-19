package myinterface;

public class Tank implements Car, Cannon {

	boolean powerOn;
	boolean reloaded;
	
	@Override
	public void startUp() {
		if (powerOn) {
			System.out.println("�õ��� ���ϴ�.");
			powerOn = false;
		} else {
			System.out.println("�õ��� �մϴ�.");
			powerOn = true;
		}
	}
	@Override
	public void reload() {
		if (reloaded)
			System.out.println("�̹� �����Ǿ����ϴ�.");
		else {
			System.out.println("��ź ����!");
			reloaded = true;
		}
	}
	@Override
	public void fire() {
		System.out.println("��ź�� �߻��մϴ�. ���礷�����");
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
