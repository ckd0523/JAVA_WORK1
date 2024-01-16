package ch15.sec08;

import java.util.*;

public class ImmutableExample {

	public static void main(String[] args) {

		List<String>ImmutableList1 = List.of("A","B","C");
		//ImmutableList1.add("D");
		
		Set<String>ImmutableSet1 = Set.of("A","B","C");
		//ImmutableSet1.remove("A");
		
		Map<Integer, String>ImmutableMap1 = Map.of(1,"A",2,"B",3,"C");
		//ImmutableMap1.put(4, "D");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		immutableList2.add("D");
		
	}

}
