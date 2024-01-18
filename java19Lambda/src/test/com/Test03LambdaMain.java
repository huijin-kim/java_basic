package test.com;

public class Test03LambdaMain {

	public static void main(String[] args) {
		System.out.println("Lambda 3");
		
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(400);
						System.out.println(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}.start();
		
		// new 부터 interface 라서 convert 가능 (command + 1)
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 10; i < 20; i++) {
					try {
						Thread.sleep(400);
						System.out.println(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}
		}).start();
		
//		new Thread(run).start();
		
		test(()->{
			for (int i = 10; i < 20; i++) {
				try {
					Thread.sleep(400);
					System.out.println(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		new Thread(test2()).start();

	}//end main

	private static Runnable test2() {
		// TODO Auto-generated method stub
		return () -> { 
			for (int i = 10; i < 20; i++) {
				try {
					Thread.sleep(400);
					System.out.println(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	}

	private static void test(Runnable run) {
		new Thread(run).start();
		// TODO Auto-generated method stub
		
	}

}
