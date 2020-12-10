package ch13;

public class Ex13_1 {
	public static void main(String[] args) {
		
		Thread test1 = new ThreadEx1_1();
		
//		Runnable r = new ThreadEx1_2();
//		Thread test2 = new Thread(r);
		Thread test2 = new Thread(new ThreadEx1_2());
		
		test1.start();
		test2.start();
	}
}

class ThreadEx1_1 extends Thread { // 1.Thread클래스를 상속해서 쓰레드를 구현
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable {		// 2. Runnable 인터페이스를 구현해서 쓰레드를 구현
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}