package quiz;

public class B16_TempPassword {

	/*
	 	4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
	 
	 	(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)
	 	0 ~ 9 / 65 ~ 90
	 */

	public static void main(String[] args) {
		
//		double rand;
//		for (int i = 0; i < 4; i++) {
//			
//			rand = Math.random() * 36;
//			
//			if (rand >= 10) {
//				rand += 55;
//				System.out.print((char)rand);
//			}
//			else
//				System.out.print((int)rand);
//		}
		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int password_size = 4;
		
		for (int i = 0; i < password_size; ++i) {
			int random_index = (int)(Math.random() * charset.length());
			System.out.print(charset.charAt(random_index));
		}
	}
}
