package test.com;

public class PrintThread2 extends Thread {

	

	@Override
	public void run() {
		
		try {
			while(true) {
				System.out.println("running....");
				Thread.sleep(1);//0.001
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("stop run...");
	}
	
}
