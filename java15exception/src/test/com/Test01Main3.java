package test.com;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("Exception....");

		// 프로그램 컴파일 또는 실행시에 발생할 수 있는 오류에 대해 대처하는 문법

		// 오류의 발생 유무와 상관없이 반드시 실행해야하는 블럭처리
		test01();

		System.out.println("end..main...");
	}// end main

	private static void test01() {
		int[] sus = new int[5];
		String name = "kim";
		String str = "100a";

		try {
			System.out.println("try...1");
			// try블럭에서 오류가 발생되면 캐치블럭으로 바로이동 후 정상실행
			System.out.println(sus[4]);

			System.out.println("try...2");
			System.out.println(10 / 10);

			System.out.println("try...3");
			System.out.println(name.length());

			System.out.println("try...4");
			System.out.println(Integer.parseInt(str) + 100);

			System.out.println("try...5");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch....ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("catch....ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println("catch....NullPointerException");
		} catch (NumberFormatException e) {
			System.out.println("catch....NumberFormatException");
		} catch (Exception e) {
			System.out.println("catch....Exception");
		} finally {
			System.out.println("finally....");
			str = "0";
			//s.close();
			//br.close();
		}
		
		System.out.println("str:"+ str );

	}

}// end class
