package ch09.sec04.exam03;

public class A {
	
	public void method1(int arg) {		// final int arg
		int var =1;									// final int var 		// final이 생략 되어져 있다.
		
		class B{
			void method2() {
				System.out.println("arg : "+arg);
				System.out.println("var : "+var);
				
//				arg=2;				//로컬에 있는 변수는 변경할수없다.
//				var=2;
				
			}
		}
		B b=new B();
		b.method2();
		
		//arg=3;
		
	}
	

}
