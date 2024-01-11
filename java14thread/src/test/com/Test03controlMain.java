package test.com;

public class Test03controlMain {

	public static void main(String[] args) {
		System.out.println("스레드 제어");
		
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		//1초가 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//스레드 종료용 세터설정...
		pt.setStop(true);
		
		System.out.println("end main....");
	}//end main

}//end class
