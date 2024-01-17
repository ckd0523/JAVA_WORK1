package ch16.sec05.exam03;

public class Member {
	
	
	private String id;			// private : 필드 : getter,setter 만들어 주어야 한다.
	private String name;

	
	public Member(String id) {
		this.id=id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("Member(String id, String name)");
	}
	
	@Override
	public String toString() {
		String info = "{ id: "+id+", name : "+name+" }";
		return info;
	}

}
