package ex03;

class Member {
	// Field : 
	// Access modifier (public,private, protected, package) 를 안붙이면 package level 이다 
	// package level 변수 : 같은 폴더에서 변수 공유
	int     id;
	String  name;
	String  email;
	
	// Constructor
	public Member () {}
	
	public Member(String msg) {
		System.out.println(msg + "객체 생성");
	}
	
	public Member(int id, String name, String email) {
		this("msg");       // 기본생성자 Member() 호출하였다 // this : 나 자신
		// super();   // super : 부모클래스 -> parent // super() : 부모클래스의 기본생성자 호출
		this.id = id;
		this.name = name;
		this.email = email;
		}
		
		
	// Override Method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
	
}


public class TestMember {

	public static void main(String[] args) {
		
		Member   m1  = new Member();
		m1.id        = 1;
		m1.name      = "박찬호";
		m1.email      = "2muchTalker@mlb.la";
		System.out.println( m1 );
		
		
		Member   m2  = new Member(2,"강호동","hodong@kang.khd");
		System.out.println( m2 );

		
		
	}

}
