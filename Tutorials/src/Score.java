import java.util.Scanner;

public class Score {
	protected String name;
	protected int score;
	protected char rating;
	public Score(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	Scanner s = new Scanner (System.in);
		public void checkScore() {
		for (int i = 0; i < 1; i++) {
			System.out.println(name+"�л��� ������ �Է����ּ���");
			int a = s.nextInt();
			if (a >= 90) {
				rating = 'A';
				System.out.println(name+"�л���"+rating+"����Դϴ�");
			}else if(a < 90 && a >= 80) {
				rating= 'B';
				System.out.println(name+"�л���"+rating+"����Դϴ�");
			}else if(a < 80 && a >= 70) {
				rating = 'c';
				System.out.println(name+"�л���"+rating+"����Դϴ�");
			} else
				rating = 'F';
				System.out.println(name+"�л���"+rating+"����Դϴ�");
		}
	}
}
