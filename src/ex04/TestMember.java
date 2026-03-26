package ex04;

class Member {
	// Field 는 전부 private
	private int      id;
	private String   name;
	private String   email;
	
	
	// Constructor
	public Member() {}	
	public Member(int id, String name, String email) {
		this.id     = id;
		this.name   = name;
		this.email  = email;
	}

	// toString() Method Override
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	// Setter 함수 : 외부 클래스에서 내부 Field 에 값을 넣는 방법
	// Getter 함수 : 외부 클래스로 내부 Field의 값을 내보내는 방법
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
}

public class TestMember {

	public static void main(String[] args) {
		
		Member   m1  = new Member();
		m1.setId    (1);
		m1.setName  ("박찬호");
		m1.setEmail ("2muchTalker@mlb.la");
		System.out.println( m1 );    
		
		String name1 = m1.getName();
		System.out.println( "m1의 이름: " + name1 );    
		
		
		Member   m2  = new Member(2,"강호동","hodong@kang.khd");
		System.out.println( m2 );
		m2.setEmail("hohodong@kang.k2");
		// m2.email     = "hohodong@kang.k2";  // error : not visible
		System.out.println( m2 );
		System.out.println( "m2의 ID: " + m2.getId() );    
		System.out.println( "m2의 이름: " + m2.getName() );    
		System.out.println( "m2의 이메일: " + m2.getEmail() );    
		

	}

}
