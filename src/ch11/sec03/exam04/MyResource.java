package ch11.sec03.exam04;

public class MyResource implements AutoCloseable {// AutoCloseable : 인터페이스

	
	private String name;
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource("+name+") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource("+name+") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource("+name+") 읽기]");
		return "abc";
	}
	
	
	@Override
	public void close() throws Exception {//예외 발생시 자동으로 리소스 닫기
		// TODO Auto-generated method stub
		System.out.println("[MyResource("+name+") 닫기]");
	}	

	
	
}
