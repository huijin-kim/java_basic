package test.com;

public class Test01Thread {

	public static void main(String[] args) {
		System.out.println("start main Thread...병렬처리");
		
		//스레드 실행 순서
		//start >> runnable(실행대기) >> 실행(run)
		// >> sleep >> 일시정지 >> 인터럽트(interrupt)
		// >> runnable >> run >> 일시정지,,,,반복
		//stop : 스레드 즉시종료 - 불안전 종료를 유발하므로 사용하지않는 것이 좋다.
		//인터럽트 : 일시정지 상태의 스레드에서 InterruptedException을 발생시켜
		//		catch문에서 실행대기상태로 가거나 종료상태로 갈수 있도록 해준다.
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);//0.5초간 슬립
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

		//1.Thread클래스의 상속처리를 통한 병렬처리
		//1-1.직접상속
		Thread t01 = new ThreadEx();
		//t01.run(); //병렬처리가 아님.
		t01.start();//병렬처리 명령
		
		
		//1-2.익명내부클래스 상속
		Thread t02 = new Thread() {
			@Override
			public void run() {
				for (int i = 100; i < 110; i++) {
					try {
						Thread.sleep(300);//0.5초간 슬립
						System.out.println(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t02.start();
		
		
		//2.Runnable 인터페이스의 상속(구현)을 통한 병렬처리
		//2-1.직접상속
		Runnable r = new Test02RunnableImpl();
		new Thread(r).start();
		
		
		//2-2.익명내부클래스 상속
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 9900; i < 9910; i++) {
					try {
						Thread.sleep(300);//0.5초간 슬립
						System.out.println(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
		
		
		System.out.println("end main....");
	}//end main

}//end class
