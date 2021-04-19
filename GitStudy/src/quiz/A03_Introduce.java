package quiz;

public class A03_Introduce {

	public static void main(String[] args) {
		String name, tel, bloodtype;
		int age, weight;
		double height;
		boolean wearglasses;
		
		name = "최현준";
		age = 28;
		tel = "010-4196-5743";
		height = 172.2;
		weight = 65;
		bloodtype = "AB";
		wearglasses = true;
		
		System.out.println("========== 출력 결과 ==========\n");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t\t: " + weight);
		System.out.println("혈액형\t\t: " + bloodtype);
		System.out.println("안경 착용 여부\t: " + wearglasses);
	}
}