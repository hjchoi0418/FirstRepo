package study;

public class B12_SwapValue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		int tmp;
		
		System.out.printf("a : %d, b : %d\n", a, b);
		
		// c�� a�� ��� ����
		tmp = a;
		
		// a�� b�� ���� (a�� �������)
		a = b;
		
		// �Ʊ� �����س��� c�� b�� ����
		b = tmp;
		
		System.out.printf("a : %d, b : %d\n", a, b);
		
	}
	
}
