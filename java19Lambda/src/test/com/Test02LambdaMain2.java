package test.com;

public class Test02LambdaMain2 {
	public static void main(String[] args) {
		System.out.println("lambda....");

		//1.변수할당 람다식
//		Car c = () -> { return 11; };
		Car c = () -> 11;  //생략가능. 
		System.out.println(c.start());
	
		//2.인자
		test(() -> 111);
	
		//3.리턴문
		System.out.println(test2().start());
	
	 }//end main

	private static Car test2() {
		return () -> 1111;
		
	}
	private static void test(Car c) {
		System.out.println(c.start());
	}
}
