package myobj.item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		
		System.out.println("������ �� á���ϴ�.");
		return false;
	}
	
	public void useAllItems() {
		for (Item item : inventory) {
			item.use();
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(4);
		
		inven1.put(new Beverage("�ݶ�", 1500));
		inven1.put(new Candy("��ĵ��", 1000));
		inven1.put(new Hamberger("��׽�����", 6000));
		inven1.put(new Snack("���ڱ�", 1800));
		
		inven1.useAllItems();
		// �� Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�. (������)
//		for (int i = 0; i < 4; i++) {
//			if (inven1.put(new Candy("���ݶ�", 3000))) {
//				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
//			} else {
//				System.out.println("�������� �� �ȵ��� put()���� false�� ���ϵ�");
//			}
//		}
//		inven1.put(new Candy("���ݶ�", 3000));
//		inven1.put(new Beverage("���̴�", 1500));
//		inven1.put(new Hamberger("��׽�����", 6000));
//		inven1.put(new Snack("���ڱ�", 1800));
	}
}
