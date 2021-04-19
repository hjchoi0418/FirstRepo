package study;
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {

	/*
	 	# TreeSet
	 	
	 	 - �ߺ����� ������ �� ����.
	 	 - �����͸� ������ �� Comparator�� �̿��� �̸� �����Ѵ�.
	 	 - ��ҷ� null�� ������� �ʴ´�.
	 	 - ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������.
	 	 - ������ TreeSet�� ������ �̸� �Ǿ� �ֱ� ������ ���ĵ� ������
	 	   �����͸� ������ ���� ���� ������.
	 */
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_����gno_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
		
		TreeSet<Mango> mango_tree = new TreeSet<>(new MangoCompareByMnoAsc());
		TreeSet<Mango> mango_tree2 = new TreeSet<>();
		
		// �ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ������� ���� �� �ִ�.
		TreeSet<String> word_tree = new TreeSet<>();
		
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
		
		System.out.println(word_tree);
		
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(31));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		
		grape_tree2.addAll(grape_tree);
		
		System.out.println(grape_tree);
		System.out.println(grape_tree2);
		
		// # TreeSet Ȱ��
		
		// decendingSet() : �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ
		System.out.println(grape_tree.descendingSet());
		
		// headSet(toElement) : �� �պ��� ���ϴ� ��� ���� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.headSet(new Grape().setGno("3")));
		
		// tailSet(toElement) : ���ϴ� ��Һ��� �� �ڱ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.tailSet(new Grape().setGno("3")));
		
		// subSet(fromElement, toElement) : ���ϴ� ��Һ��� �����ؼ� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
		
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(5);
		int_tree.add(15);
		int_tree.add(75);
		int_tree.add(33);
		int_tree.add(21);
		int_tree.add(9);
		int_tree.add(1);
		
		System.out.println(int_tree);
		
		// ceiling(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ ���� ����)
		System.out.println(int_tree.ceiling(20));
		
		// floor(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ ���� ����)
		System.out.println(int_tree.floor(20));
		
		// higher(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ �� ������)
		System.out.println(int_tree.higher(21));
		
		// lower(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ �� ������)
		System.out.println(int_tree.lower(21));
		
		// �������� : ����Ʈ���� ���� 5�� �߰��Ҷ� mno���� �������� ������ �ǵ��� ����� Ȯ��
		mango_tree.add(new Mango("MANGO003", 10, 5));
		mango_tree.add(new Mango("MANGO005", 13, 6));
		mango_tree.add(new Mango("MANGO002", 9, 4));
		mango_tree.add(new Mango("MANGO004", 12, 5));
		mango_tree.add(new Mango("MANGO001", 15, 4));
		System.out.println(mango_tree);
		
		mango_tree2.add(new Mango("54321", 10, 10));
		mango_tree2.add(new Mango("01234", 10, 10));
		mango_tree2.add(new Mango("00432", 10, 10));
		mango_tree2.add(new Mango("04312", 10, 10));
		System.out.println(mango_tree2);
	}
}

class MangoCompareBySweetAsc implements Comparator<Mango> {
	@Override
	public int compare(Mango o1, Mango o2) {
		if (o1.sweet > o2.sweet ) {
			return 1;
		} else if (o1.sweet < o2.sweet) {
			return -1;
		} else {
			return 0;
		}
	}
}

class MangoCompareByMnoAsc implements Comparator<Mango> {
	@Override
	public int compare(Mango o1, Mango o2) {
		return o1.mno.compareTo(o2.mno);
	}
}

// Comparator : ���� �� ����ϴ� �� ���� Ŭ������ ����� �������̽�
// Comparable : �� ��ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽�
class Mango implements Comparable<Mango> {
	String mno;
	int sweet;
	int size;
	
	public Mango(String mno, int sweet, int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%d/%d", mno, sweet, size);
	}
	
	// this vs �Ű������� compare �޼��带 �����ϸ� �ȴ�.
	@Override
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	}
}