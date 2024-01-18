package test.com;

public class Test02LambdaMain {

	public static void main(String[] args) {
		System.out.println("lambda....");

		//2.람다식으로 표현해서 리터럴로 사용할 수 있다.
				//람다식으로 사용하고자 하는 인터페이스의 추상메소드는 무조건 1개만 정의되어있어야한다.
				
				//실행문이 여러줄일 때는 블럭처리
//				Person p = ()->{
//						System.out.println("sleep()...1");
//						System.out.println("sleep()...1");
//						System.out.println("sleep()...1");
//						System.out.println("sleep()...1");
//						System.out.println("sleep()...1");
//						System.out.println("sleep()...1");
//					};
				//실행문이 한줄일 경우는 블럭생략가능.
				
				//1.변수할당 람다식
				Person p = ()->System.out.println("sleep()...1");
				p.sleep();
				
				//2.인자
				test(()->System.out.println("sleep()...2"));
				
				//3.리턴문
				test2().sleep();
				
			}//end main

			private static Person test2() {
				return ()->System.out.println("sleep()...3");
			}

			private static void test(Person p) {
				p.sleep();
			}
}
