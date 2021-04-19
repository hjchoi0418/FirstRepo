package myinterface;

import myobj.remote.AirconditionRemocon;
import myobj.remote.TelevisionRemocon;

// �������̽��� ���� ���յ��� ���� �ڵ带 �ۼ��� �� �ִ�.
public class TestRemocon {
	
	public static void main(String[] args) {
		test(new AirconditionRemocon());
		test(new TelevisionRemocon());
	}
	
	public static void test(Remocon remocon) {
		remocon.power();
		remocon.up(1);
		remocon.down(1);
		remocon.change();
	}
}
