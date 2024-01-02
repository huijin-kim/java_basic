package test.com;

public class Test01if {

	// statment 제어
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//줄 정리 : comman + shift + f
		System.out.println("if~else...");

		if (true) {
			System.out.println("true1");
		}
		if (5 == 5) {
			System.out.println("true2");
		}
		
		boolean bool = 5==5;
		if (bool) {
			System.out.println("true3");
		}else {
			System.out.println("else");
		}
		
		double avg = 99.9;
		
		if(avg >90) {
			System.out.println('A');
		} else if(avg>80) {
			System.out.println('B');
		} else if(avg>70) {
			System.out.println('C');
		} else if(avg>60) {
			System.out.println('D');
		} else if(avg>50) {
			System.out.println('E');
		} else {
			System.out.println('F');
		}
		
		
		

	}// end main

}// end class
