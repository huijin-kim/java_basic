package test.com;

public class Test02LambdaMain3 {
	public static void main(String[] args) {
		System.out.println("lambda....");
		
		//Bus와 Taxi를 이용해서 람다식으로 처리할것.
		
		//1.변수할당 람다식
		//type을 지정안함. 
		Bus b = (int x) -> System.out.println("open().... " + x);
		
		b.open(10);
	
		//2.인자
		test((x) -> System.out.println("open()... " +x));
	
		//3.리턴문
		test2().open(1000);
		
		
		
		//taxi-----------------------------------------
//		Taxi t = (int x, int y) -> x+y;
		Taxi t = (x,y) -> x+y;
		
		int result = t.sum(11,22);
		System.out.println(result);
	
		//2.인자
		test3((x,y) -> x+y);
	
		//3.리턴문
		test4().sum(1111,2222);
		
	 }//end main
	
	private static Taxi test4() {
		// TODO Auto-generated method stub
		return (x,y) -> x+ y;
	}

	private static void test3(Taxi t) {
		int result = t.sum(111,222);
		System.out.println(result);
	}

	private static Bus test2() {
		return (x) -> System.out.println("open..." + x);
	}

	private static void test(Bus b) {
		b.open(100);
	}
}//end class
