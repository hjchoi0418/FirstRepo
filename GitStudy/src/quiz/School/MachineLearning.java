package quiz.School;

public class MachineLearning extends Programming {
	final static String[] subject_name = {"����", "����", "����", "PL", "�����"};
	
	int statistics;
	
	public MachineLearning(int st_num) {
		super(st_num);
		this.statistics = ran.nextInt(101);
		this.st_num = "M";
		this.st_num += st_num;
	}
	
	@Override
	public void report_card() {
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t%s\t����\t���\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3], subject_name[4]);
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				st_num,
				name,
				korean,
				english,
				math,
				programming,
				statistics,
				korean + english + math + programming + statistics,
				(korean + english + math + programming + statistics) / 5.0);
		System.out.println("---------------------------------------------------------------------");
	}
}