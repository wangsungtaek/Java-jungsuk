package ch09;

import java.util.ArrayList;

public class RountTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(100);
//		arrayList.add(new Integer("100"));
		
		int a = arrayList.get(0);
		int b = arrayList.get(0).intValue();
		System.out.println(a);
		System.out.println(b); 
	}
}
