package ch06.sec07;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Korean k1 = new Korean("박자바","012345-6789102");
		Korean k2 = new Korean("김자바","012345-6789101");
				
		System.out.println(k1.nation);		
		System.out.println(k1.name);		
		System.out.println(k1.ssn);		
		System.out.println(k2.nation);		
		System.out.println(k2.name);		
		System.out.println(k2.ssn);		
		
	}

}
