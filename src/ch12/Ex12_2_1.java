package ch12;

import java.util.*;

public class Ex12_2_1 {
	public static void main(String[] args) {
		HashMap<String, Student1> map = new HashMap<>(); // JDK1.7부터 생성자에 타입지정 생략가능
		map.put("자바왕", new Student1("자바왕", 1, 1, 100, 100, 100));
		
		Student1 s = map.get("자바왕");
		
		System.out.println(s.name);
		System.out.println(map);
	} // main
}
class Student1 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}