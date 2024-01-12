package Problem.exam06;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student stud1 = new Student("선남");
		stud1.inputGrades();
		System.out.println();
		System.out.println(stud1);
		System.out.println("총점은 "+stud1.getTotal()+"이고, 학점은"+stud1.Grade()+"이다.");
		System.out.println();
		Student stud2 = new Student("선녀");
		System.out.println();
		stud2.inputGrades();
		System.out.println();
		System.out.println(stud2);
		System.out.println("총점은 "+stud2.getTotal()+"이고, 학점은 "+stud2.Grade()+"이다.");
		
	}

}
