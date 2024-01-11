package test.com;

public class Test01Main5 {

	public static void main(String[] args) {
		System.out.println("Exception....");

		//예외처리를 강제발생 시켜주는 throw 예약어
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end..main...");
	}// end main

	

}// end class
