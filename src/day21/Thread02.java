package day21;

class MyThread2 implements Runnable{

	//반드시 run구현해야 함
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(i+"번째 "+Thread.currentThread().getName());
		}
		
	}
	
}

public class Thread02 {

	public static void main(String[] args) {
		/* Runnable를 구현하는 방법
		 * 직접 객체 생성만으로 실행 불가능
		 * Thread클래스의 생성자로 runnable 구현 객체를 추가*/
		
		MyThread2 mth=new MyThread2();
		Thread th=new Thread(mth);
		th.start();
		
		try {
			th.join(); //순서를 지켜야 할 때 사용 Thread가 다 실행되기 전 까진 다른 코드가 실행되지 않음
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread th2=new Thread(new MyThread2());
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main End~!!!");

	}

}
