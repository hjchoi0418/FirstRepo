package quiz;

public class B16_TempPassword {

	/*
	 	4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
	 
	 	(비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)
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
