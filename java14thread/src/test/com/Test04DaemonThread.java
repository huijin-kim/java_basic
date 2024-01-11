package test.com;

public class Test04DaemonThread {

	public static void main(String[] args) {
		System.out.println("데몬 스레드");
		
		//데몬스레드 : 주 스레드(메인스레드)작업을 돕는 보조적역할을 하는 스레드
		//		   주 스레드가 종료되면 데몬스레드는 자동종료
		//	 	   주 스레드와 동반종료되는것을 제외하면 큰차이없다.
		//설정: 스레드시작 전에 반드시 데몬세팅메소드 호출
		
		//컨셉 : 주 스레드가 종료될때까지 저장기능처리 데몬스레드 추가
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);//메인스레드가 종료되면 같이 종료하라는 명령
		ast.start();
		
		//3초가 일시정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("end main....");
	}//end main

}//end class
