package test.com;

public class Test01LambdaMain2 {

	public static void main(String[] args) {
		System.out.println("Lambda...2");
		
		//Car를 익명내부클래스로 사용하여 일급함수의 특징을 구현해보세요.
		//1.변수할당
		Car c = new Car() {
			@Override
			public int start() {
				System.out.println("start....1");
				return 10;
			}
		};
		System.out.println(c.start());
		
		//2.인자
		test(new Car() {
			
			@Override
			public int start() {
				System.out.println("start....2");
				return 100;
			}
		});
		
		//3.리턴문
		System.out.println(test2().start());
		
		
	}//end main

	private static Car test2() {
		return new Car() {
			
			@Override
			public int start() {
				System.out.println("start....3");
				return 1000;
			}
		};
	}

	private static void test(Car car) {
		System.out.println(car.start());
	}
	
	

}//end class