package quiz;

public class B14_Gugudan {

	/*
		1. 구구단을 다음과 같이 가로로 출력해보세요
		
		2단 : 2x1=2 2x2=4 2x3=6 ...
		3단 : 3x1=3 3x2=6 3x3=9 ...
		4단 : ...
		
		2. 구구단을 다음과 같이 세로로 출력해보세요
		
		2단		3단		4단		...
		2x1=2	3x1=3	4x1=4	...
		2x2=4	3x2=6	4x2=8	...
		...
	*/
	
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.print(dan + "단: ");
			
			for (int gop = 1; gop <= 9; gop++) {
				
				System.out.printf("%dX%d=%-3d", dan, gop, dan * gop);
				
				if (gop == 9)
					System.out.println();
			}
		}
		
		System.out.println();
		
		for (int gop = 2; gop <= 9; gop++) {
			System.out.print(gop + "단\t");
			if (gop == 9)
				System.out.println();
		}
		
		for (int gop = 1; gop <= 9; gop++) {
			
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
				if (dan == 9)
					System.out.println();
			}
		}
	}
}