package study;

public class C12_Interface {

	/*
	 	# �������̽� (interface)
	 	
	 	 - class�� ����� ���� �� ���� �� ���ٴ� ������ ������ ��
	 	 - �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�.
	 	 - �������̽� ������ ������ �ڵ����� final static�� �ȴ�.
	 	 - �������̽� ������ �޼��带 ������ �� default�� ���̸� �⺻ ������ ������ �� �ִ�.
	 */
	public static void main(String[] args) {
		new OrangeTree().click();
	}
}

interface CanClick {
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻ ����."
				+ "(�������̵� �ؼ� ������ּ���)");
	}
}

interface CanPunch {
	void punch();
}

class OrangeTree implements CanClick, CanPunch {
	
	@Override
	public void punch() {
		
	}
	
	@Override
	public void click() {
		CanClick.super.click();
	}
}