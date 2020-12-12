package ch13;

public class Ex13_10 {
	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
	
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("1쓰레드 정지");
			th1.suspend();
			Thread.sleep(3000);
			System.out.println("2쓰레드 정지");
			th2.suspend();
			Thread.sleep(3000);
			System.out.println("1쓰레드 재시작");
			th1.resume();
			Thread.sleep(3000);
			System.out.println("2쓰레드 재시작");
			th2.resume();
			Thread.sleep(3000);
			System.out.println("1,2쓰레드 정지");
			th1.stop();
			th2.stop();
			Thread.sleep(3000);
			System.out.println("3쓰레드 정지");
			th3.stop();
		} catch (InterruptedException e) {}
		
		System.out.println("main 종료");
	}
}

class MyThread implements Runnable {
	volatile boolean stopped = false;
	volatile boolean suspended = false;
	Thread th;
	
	MyThread(String name){
		th = new Thread(this, name);
	}
	void start() {
		th.start();
	}
	void stop() {
		stopped = true;
	}
	void suspend() {
		suspended = true;
	}
	void resume() {
		suspended = false;
	}
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	}
}