package ch08;

public class Ex8_9 {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		method1();
	} // main 메서드의 끝
	
	static void method1() throws Exception {
		System.out.println(2);
		method2();
	} // method1의 끝
	
	static void method2() throws Exception {
		System.out.println(3);
		throw new Exception();
	} // method2의 끝
}

