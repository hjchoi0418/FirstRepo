package myobj.item;

public class ItemTest {

	public static void main(String[] args) {
		Candy c1 = new Candy("��ĵ��", 1000);
		Beverage b1 = new Beverage("�ݶ�", 1500);
		Hamberger h1 = new Hamberger("�Ұ�����", 3000);
		Snack s1 = new Snack("����Ĩ", 1800);
		
		c1.info();
		c1.use();
		b1.info();
		b1.use();
		h1.info();
		h1.use();
		s1.info();
		s1.use();
	}
}