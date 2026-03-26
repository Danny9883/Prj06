package ex01;

/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/
class Score {
//입력:번호,이름,국어,영어,수학
//     num, name, kor, eng, mat 
//출력:번호 이름 국어 영어 수학 총점 평균  등급
//     num, name, kor, eng, mat, tot, avg, grade	
	
	// Field
	// 입력 num, name, kor, eng, mat 
	int      num;
	String   name;
	int      kor;
	int      eng;
	int      mat;
	
	// 출력  num, name, kor, eng, mat, tot, avg, grade	
	int      tot;
	double   avg;
	char     grade;
	
	// Constructpr
	// sts 에서 오른쪽마우스 -> source -> Generate Constructor using Field
	// 단축키 : alt + shift + s
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		// 계산
		getTot();  
		getAverage();
		getGrade();
	}
	
	private void getTot() {
		this.tot  = this.kor + this.eng + this.mat;		
	}
	
	private void getAverage() {
		this.avg  =  (this.kor + this.eng + this.mat) / 3.0;
	}
	
	private void getGrade() {
		// ctrl + shift + p : 대응하는 {}를 찾아준다.
		
		switch ((int)this.avg/10) {
		case 10 : this.grade = 'A'; break; 
		case 9  : this.grade = 'A'; break; 
		case 8  : this.grade = 'B'; break; 
		case 7  : this.grade = 'C'; break; 
		case 6  : this.grade = 'D'; break; 
		case 5  : this.grade = 'F'; break; 
		case 4  : this.grade = 'F'; break; 
		case 3  : this.grade = 'F'; break; 
		case 2  : this.grade = 'F'; break; 
		case 1  : this.grade = 'F'; break; 
		}
		
		/* 
		if (90 <= this.avg) {
			this.grade = 'A';
		} else {
			if (80 <= this.avg && this.avg < 90) {
				this.grade = 'B';
			} else {
				if (70 <= this.avg && this.avg < 80) {
					this.grade = 'C';
				} else {
					if (60 <= this.avg && this.avg < 70) {
						this.grade = 'D';
					} else { 
						this.grade = 'F'; 
					}
				}
			}
		}    */
		
		
		
		
	}	// get grade end
		

	static void title() {
		String  title = "번호 이름 국어 영어 수학 총점 평균  등급";
		System.out.println( title );		
	}
	
	// Method
	void disp() {
		String  fmt         = "%d   %s   %d   %d   %d   %d   %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
	}	
	
} // class end


public class TestScore {

	public static void main(String[] args) {
		
		// Score  sc1  = new Score();   // error : The constructor Score() is undefined
		   // 기본생성자가 없고 다른 생성자만 존재할때  new Score(); 에러
		Score.title();
		
		Score  sc1 = new Score(1,"사나",70,80,90);		 
		sc1.disp();
		
		Score  sc2 = new Score(2,"모모",0,70,100);
		sc2.disp();

		Score  sc3 = new Score(3,"키키",100,100,100);
		sc3.disp();
		
		Score  sc4 = new Score(4,"원영",90,90,89);
		sc4.disp();
		
	}

}