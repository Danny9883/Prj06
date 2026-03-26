package ex05;

/*
 num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100

입력:번호,이름,국어,영어,수학 
출력:번호 이름 국어 영어 수학 총점 평균  등급       */

// 모든 Field 는 private
// 생성자, Getter/Setter , toString() 만들어서 작업


class Score {
	// Field
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;
	
	
	// Constructor
	public Score() {}
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		calcAll();

	}

	// Method
	private void calcTot() {
		this.tot = this.eng + this.kor + this.mat;
	}
	private void calcAvg() {
		this.avg = (this.eng + this.kor + this.mat) / 3.0 ;
	}
	private void calcGrade() {
		if (90<=avg)
			this.grade = 'A';
		else if (80<= avg && avg < 90)
			this.grade = 'B';
		else if (70<= avg && avg < 80)
			this.grade = 'C';
		else if (60<= avg && avg < 70)
			this.grade = 'D';
		else
			this.grade = 'F';
	}
	
	static void title() {
		String  title = "번호  이름  국어  영어  수학  총점  평균  등급";
		System.out.println( title );		
	}
	
	void disp() {
		String text = "  %d   %s   %d   %d   %d    %d   %.2f    %c \n";
		System.out.printf(text, num, name, kor, eng, mat, tot, avg, grade);
	}

	void calcAll() {
		calcTot();
		calcAvg();
		calcGrade();
	}
	
	
	
	
	// Getter , Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calcAll();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calcAll();
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calcAll();
	}
	
	
	
	
	
	
	
	
	
	
	// toString
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	
	

	

	
	
	
	
	
}

public class TestScore {

	public static void main(String[] args) {
		Score.title();
		
		Score  sc1 = new Score(1,"사나",70,80,90);
		sc1.disp();
		System.out.println(sc1);
		
		Score  sc2 = new Score();
		sc2.setNum(2); sc2.setName("모모"); sc2.setKor(0); sc2.setEng(70); sc2.setMat(100);
		sc2.disp();

		// sc2.name = ""; private 인것 확인 완료
		
		sc2.setKor(88);
		sc2.setEng(83);
		sc2.disp();
		System.out.println(sc2.getName()+"의 총점 : "+ sc2.getTot());
		
		
		
		
	}

}
