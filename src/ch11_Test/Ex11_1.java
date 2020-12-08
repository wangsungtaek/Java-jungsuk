package ch11_Test;

import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add(1);
		list1.add(3);
		list1.add(6);
		list1.add(5);
		list1.add(2);
		list1.add(4);
		list1.add(4);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);

		print(list1,list2);
		
		System.out.println("list1에 list2 항목이 전부 포함됨 ? " + list1.containsAll(list2));
		
		list2.add("C");
		list2.add("A");
		list2.add("B");
		list2.add(3,"D");
		print(list1,list2);
		
		list2.set(3, "DD");
		print(list1,list2);
		
		System.out.println(list2.indexOf("C"));
		
		print(list1,list2);
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
	}
}
