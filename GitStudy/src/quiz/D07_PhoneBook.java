package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_PhoneBook {

	public D07_PhoneBook() {
		phonebook = new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
		
		phonebook.get("����").put("010-1234-1234", "����");
	}

	/*
	 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 	
	 	1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�.
	 	2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�.
	 	3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�.
	 	
	 	# �����ؾ� �� �޼���
	 	
	 	1. ���ο� �׷��� �߰��ϴ� �޼���
	 	2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷�)
	 	3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
	 	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	 	5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	 */
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ�. : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public boolean addNumber(String groupName, String phoneNumber, String name) {
		
		// phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���
		// phonebook.values() : �׷� �̸��� Ű������ ��� ������ �� �ִ� �׷� �ؽ��� �ν��Ͻ�
		
		for (HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		} else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		
		return true;
	}
	
	public void printPhoneBook() {
		for (String groupName : new TreeSet<>(phonebook.keySet())) {
			
			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/* 
			 	# TreeSet�� �� ���� ������
			 	
			 	 1. ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
			 	 2. �÷����� ���� (���� ������ �����ϴ� �÷����� ���׸� Ÿ�� Comparable�� ���)
			 */
			TreeSet<Entry<String, String>> sortedEntrySet =
				new TreeSet<> (new Comparator<Entry<String, String>>() {
					@Override
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						// �̸� �������� 1�� ���� ��, ��ȭ��ȣ �������� 2�� ����
						int value_diff = o1.getValue().compareTo(o2.getValue());
						
						if (value_diff == 0) {
							return o1.getKey().compareTo(o2.getKey());
						} else {
							return value_diff;
						}
					}
				});
			
			sortedEntrySet.addAll(group.entrySet());
			
			for (Entry<String, String> entry : sortedEntrySet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
			}
		}
	}
	
	public void searchByName(String keyword) {
		
		int count = 0;
		System.out.println("- - �˻� ��� - -");
		for (HashMap<String, String> group : phonebook.values()) {
			for (Entry<String, String> entry : group.entrySet()) {
				if (entry.getValue().contains(keyword)) {
					System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
					count++;
				}
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public void searchByPhoneNumber(String number_fragment) {
		int count = 0;
		System.out.println("- - �˻� ��� - -");
		for (HashMap<String, String> group : phonebook.values()) {
			for (String phoneNumber : group.keySet()) {
				if (phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
					count++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook book = new D07_PhoneBook();
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");
		book.addGroup("���б� ��â");
		book.addGroup("����б� ��â");
		book.addGroup("���е���");
		book.addGroup("�����");
		
		book.printGroupList();
		
		book.addNumber(null, "123-1234-1234", "�赿��");
		book.addNumber(null, "010-1234-1235", "�߼���");
		book.addNumber(null, "010-1234-1236", "�̴�ȣ");
		book.addNumber(null, "010-1234-1237", "�߽ż�");
		book.addNumber(null, "010-1234-1238", "��ȣ��");
		book.addNumber(null, "010-1234-2000", "��ȣ��");
		
		book.printPhoneBook();
		
		book.searchByName("ȣ");
		book.searchByPhoneNumber("010");
	}
	
//	public static void newGroup(HashMap group) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("* �� �׷� �̸� ���� >> ");
//		String input = sc.nextLine();
//		group.put(input, new HashMap<>());
//	}
//	
//	public static void newNumber(HashMap group) {
//		Scanner sc = new Scanner(System.in);
//		
//		if (group.isEmpty()) {
//			System.out.println("������ �׷��� �����ϴ�.");
//			
//			System.out.print("* �� ��ȭ��ȣ �Է� >> ");
//			String inputNum = sc.nextLine();
//			System.out.print("* �̸� �Է� >> ");
//			String inputName = sc.nextLine();
//			
//			phoneNum.put(inputNum, inputName);
//			group.put("�̺з�", phoneNum);
//		} else {
//			System.out.println("�׷� ��� : " + group.keySet());
//			
//			System.out.print("�׷� ���� >> ");
//			String gName = sc.nextLine();
//			System.out.print("* �� ��ȭ��ȣ �Է� >> ");
//			String inputNum = sc.nextLine();
//			System.out.print("* �̸� �Է� >> ");
//			String inputName = sc.nextLine();
//			
//			phoneNum.put(inputNum, inputName);
//			group.put(gName, phoneNum);
//		}
//	}
//	
//	public static void showAll(HashMap<String, HashMap> group) {
//		TreeSet<String> names = new TreeSet<>();
//		for (Entry<String, HashMap> gEntry : group.entrySet()) {
//			String gKey = gEntry.getKey();
//			HashMap<String, String> gValue = gEntry.getValue();
//			
//			for (Entry<String, String> pEntry : gValue.entrySet()) {
//				names.add(pEntry.getValue());
//			}
//			
//		}
//		names.descendingIterator();
//		System.out.println(names);
//	}
//	
//	public static void searchName(HashMap<String, String> phoneNum) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("* �˻��� �̸� �Է� >> ");
//		String inputStr = sc.nextLine();
//		
//		if (phoneNum.values().contains(inputStr)) {
//			
//		} else
//			System.out.println("�˻� ����� �����ϴ�.");
//	}
//	
//	public static void searchNum(HashMap<String, String> phoneNum) {
//		
//	}
}
