package test.com;

public class Test02RunnableImpl implements Runnable {

	@Override
	public void run() {
		// 병렬처리할 로직 작성
		for (int i = 1110; i < 1120; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
