package quiz.School;

public class Network extends Student {
	final static String[] subject_name = {"국어", "영어", "리눅스", "CCNA"};
	
	int linux;
	int ccna;
	
	public Network(int st_num) {
		super(st_num);
		this.linux = ran.nextInt(101);;
		this.ccna = ran.nextInt(101);;
		this.st_num = "N";
		this.st_num += st_num;
	}
	
	@Override
	public void report_card() {
		System.out.printf("학번\t이름\t%s\t%s\t%s\t%s\t총점\t평균\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				st_num,
				name,
				korean,
				english,
				linux,
				ccna,
				korean + english + linux + ccna,
				(korean + english + linux + ccna) / 4.0);
		System.out.println("---------------------------------------------------------------------");
	}
}