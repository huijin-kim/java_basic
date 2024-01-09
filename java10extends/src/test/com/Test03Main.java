package test.com;

public class Test03Main {
	public static void main(String[] args) {
		
		//추상 메서드 : 추상메소드를 포함할 수 있는 클래스
		//추상 메소드 :  메소드의 {} 블럭이 없이 정의하는 메소드
		
		//추상 클래스는 반드시 다형성으로 객체생성해야한다. 
		Man m = new SuperMan();
		m.sleep();
		m.work();
		
		Man m2 = new Man() {
			@Override
			public void work() {
				System.out.println("Anonymous work()");
			}
		};
		m2.work();
		
		
	}//end main
}//end class
