package test.com;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("save....");
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("running.....");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;//오류 발생대비하기위한 반복문 탈출용 브레이크
			}
			save();
		}
		//데몬스레드 종료시점은 메인스레드 종료되는 시점과 같기때문에
		//stop run...메세지는 출력이 안됨..
		System.out.println("stop run....");
		
	}

}
