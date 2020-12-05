package ch11;

import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) {
		// 기본 길이(용량, capacity) 가 10인 ArrayLIst를 생성
		ArrayList list1 = new ArrayList(10);
		// ArrayList는 객체 배열인데 기본형이 올 수 있는 이유는
		// 컴파일러에 의해 기본형잉 참조형으로 오토박싱 되어서 가능하다.
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		// ArrayList(Collection c) 생성자 사용
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// Collection은 인터페이스 Collections는 유틸 클래스
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// list1에 list2가 전부 있는지?
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("indexOf=" + list1.indexOf(3));
		list1.remove(new Integer(1));
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
