package ch17.problem.exam05;

import java.util.Arrays;
import java.util.List;

public class SearchJava {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("This is a java book", "Lambda Expression", "Java8 supports ;ambda expressions");
		list.stream()
	
		.filter(n->n.toLowerCase().contains("java"))
		.forEach(a->System.out.println(a));
		
		
		

		
	}

}
