package ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable2 {
	
	//추상메서드 (매개변수 두개)
	public Member create(String id, String name);

}
