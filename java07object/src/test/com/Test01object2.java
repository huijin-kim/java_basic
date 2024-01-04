package test.com;

//임포트 단축키 : ctrl + shift + o
public class Test01object2 {

	public static void main(String[] args) {
		System.out.println("object...2");

		//객체를 사용하는 이유
		int a = 10;
		int b = 20;
		int[] sus = new int[] {10,20};
		
		
//		//사용자 정의 클래스-메소드 블럭안에 정의되면 로컬내부클래스
		class Person{
			//1.속성-전역변수,멤버필드
			int age = 33;
			String name = "kim";
			int[] score = new int[] {11,22,33};
			//서로다른 타입을 하나의 타입으로 정의하려면 객체를 사용한다.
			//객체를 사용하려면 클래스를 정의하고 클래스의 전역변수에 서로다른 타입들을 정의한다.
			
			//2.기능-메소드,함수
			void test() {
				class Cat{
					
				}
			}
		}
		
		Person p = new Person();
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.score);
		
	}//end main
}//end class

