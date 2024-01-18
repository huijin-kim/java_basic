package test.com;

public class Test02LambdaMain4 {
	public static void main(String[] args) {
		System.out.println("lambda....");
		
		//1.변수할당 람다식

//		MyValidator my = new MyValidator() {
//			@Override
//			public boolean check() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
		
		MyValidator my = () -> false;
		boolean bool = my.check();
		System.out.println(bool);
	
		//2.인자
		test(() -> false);

		//3.리턴문
		bool = test2().check();
		System.out.println(bool);
		
	 }//end main

	private static MyValidator test2() {
		// TODO Auto-generated method stub
		return () -> false;
	}

	private static void test(MyValidator my) {
		System.out.println(my.check());
	}
	
}//end class
