package test.com;

public class Test05synchronizedMain {

	public static void main(String[] args) {
		System.out.println("synchronized....");
		
		//동기화 메소드 : 스레드가 사용중인 객체를 다른스레드가 변경할 수 없게 한다.
		//스레드가 끝날때까지 개체에 잠금을 걸어서 사용할 수 없도록 한다.
		//임계역역 : 크리티컬 섹션이라 하며 멀티스레드 프로그램에서
		//		 단 하나의 스레드만 실행 할 수 있는 코드영역을 의미한다.
		//결론적으로 임계영역을 지정하기위한 메소드를 동기화메소드라고 한다.
		
		Calculator cal = new Calculator();
		
		User01 u1 = new User01();
		u1.setCal(cal);
		u1.start();
		
		
		User02 u2 = new User02();
		u2.setCal(cal);
		u2.start();
	}//end main

}//end class
