package test.com;

public class Test01Main6 {

	public static void main(String[] args) {
		System.out.println("Exception....");

		//예외처리를 강제발생 시켜주는 throw 예약어
		//상속을 통해서 사용자정의 예외처리클래스 생성가능
		try {
			throw new MyException(33);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end..main...");
	}// end main

	

}// end class
