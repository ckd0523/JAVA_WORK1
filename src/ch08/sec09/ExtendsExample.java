package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
		//ia.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();

	}

}
