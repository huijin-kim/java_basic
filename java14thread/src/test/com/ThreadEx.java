package test.com;

public class ThreadEx extends Thread {

	//run메소드 오버라이딩
	@Override
	public void run() {
		//병렬처리할 로직 작성
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
