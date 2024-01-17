package ch16.sec01;

@FunctionalInterface	// 컴파일 과정에서 추상메서드가 하나인지 검사
public interface Calculable {

	void calculate(int x, int y);
	
}
