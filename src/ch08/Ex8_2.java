package ch08;

public class Ex8_2 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0);
			System.out.println(2);
		} catch(ArithmeticException e) {
			System.out.println(3);
		}
		System.out.println(4);
	}
}
