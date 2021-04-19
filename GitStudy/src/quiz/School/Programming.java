package quiz.School;

public class Programming extends Student {
	final static String[] subject_name = {"국어", "영어", "수학", "PL", "역사"};
	
	int math;
	int programming;
	int history;
	
	public Programming(int st_num) {
		super(st_num);
		math = ran.nextInt(101);
		programming = ran.nextInt(101);
		history = ran.nextInt(101);
		this.st_num = "P";
		this.st_num += st_num;
	}
	
	@Override
	public void report_card() {
		System.out.printf("학번\t이름\t%s\t%s\t%s\t%s\t%s\t총점\t평균\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3], subject_name[4]);
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				st_num,
				name,
				korean,
				english,
				math,
				programming,
				history,
				korean + english + math + programming + history,
				(korean + english + math + programming + history) / 5.0);
		System.out.println("---------------------------------------------------------------------");
	}
	
//	public Programming(int num, int korean, int english, int math, int programming, int history) {
//	this.name = getRandomName();
//	this.korean = korean;
//	this.english = english;
//	this.math = math;
//	this.programming = programming;
//	this.history = history;
//	this.st_num = "P";
//	this.st_num += num;
//	
//	this.sum = korean + english + math + programming;
//	this.avg = sum / 4.0;
//}
}