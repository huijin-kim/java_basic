package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Exception....");
		
		//프로그램 컴파일 또는 실행시에 발생할 수 있는 오류에 대해 대처하는 문법
		
		//배열에 인덱스 범위를 벗어나서 접근하면 오류.(비정상 종료)
		test01();
		
		
		//0으로 나누면 오류발생. by zero
		test02();
		
		
		//null에 접근하면 즉 .을 찍으면 오류
		test03();
		
		//숫자변환시 발생하는 오류.
		test04();
		
		System.out.println("end..main...");
	}//end main

	private static void test04() {
		String str = "100a";
		try {
			System.out.println("try...1");
			System.out.println(Integer.parseInt(str) + 100);
			System.out.println("try...2");
		} catch (NumberFormatException e) {
			System.out.println("catch....");
		}
	}

	private static void test03() {
		String name = null;
		
		try {
			System.out.println("try...1");
			System.out.println(name.length());
			System.out.println("try...2");
		} catch (NullPointerException e) {
			System.out.println("catch....");
		}
	}

	private static void test02() {
		try {
			System.out.println("try...1");
			System.out.println(10/0);
			System.out.println("try...2");
		} catch (ArithmeticException e) {
			System.out.println("catch....");
		}
	}

	private static void test01() {
		int[] sus = new int[5];
		
		try {
			System.out.println("try...1");
			//try블럭에서 오류가 발생되면 캐치블럭으로 바로이동 후 정상실행
			System.out.println(sus[5]);
			
			System.out.println("try...2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch....");
		}
		
	}

}//end class
