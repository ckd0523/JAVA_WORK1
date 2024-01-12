package Problem.exam03;

public class Pet {
	
	private String name;
	private int age;
	
	public Pet() {
		name="";
		age=0;
	}
	
	public Pet(String name, int age) {
		this.name=name;
		this.age=age;		
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	
	public String toString() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		return "";
	}
	

}
