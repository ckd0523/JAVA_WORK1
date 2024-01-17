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
		//immutableList2.add("D");
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		//immutableSet2.add("D");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		//immutableMap2.put(4, "D");
		
		String[] arr = {"A","B","C"};
		List<String> immutableList3 = Arrays.asList(arr);
		
		
		
	}

}
