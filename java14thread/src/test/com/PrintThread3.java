package test.com;

public class PrintThread3 extends Thread {

	

	@Override
	public void run() {
		//Thread.interrupted() : pt3.interupt()호출시 true반환
		while(true) {
			System.out.println("running....");
			if(Thread.interrupted()) break;
		}
		
		
		System.out.println("stop run...");
	}
	
}
