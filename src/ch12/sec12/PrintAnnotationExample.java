package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {

		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			
			method.invoke(new Service());
			
			printLine(printAnnotation);
		}
		
	}
	// 어노테이션의 value를 number 만큼 출력
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			
			for(int i =0; i<number; i++) {			//value를 가져와서 number만큼 출력하겠다.
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
