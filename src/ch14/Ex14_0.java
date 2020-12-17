package ch14;

public class Ex14_0 {
	public static void main(String[] args) {
//		Object obj = (a,b) -> a > b ? a : b;
//		MyFunction f = new MyFunction() {
//			public int max(int a, int b) {
//				return a > b ? a:b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f = (a,b) -> a > b ? a : b; // 람다식. 익명객체
		
		int value = f.max(3,5); // 함수형 인터페이스
		System.out.println(value);
	}
}
@FunctionalInterface	// 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction2 {
	int max(int a, int b);
}