package Problem.exam08;

public class Student {

	public int number;
	public String name;
	
	public Student() {}
	
	public Student(int Number, String Name) {
		number=Number;
		name = Name;
	}
	
	
	
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String toString() {
		return "학번 : "+number+"이름 : "+name;
	}
	
	
}
