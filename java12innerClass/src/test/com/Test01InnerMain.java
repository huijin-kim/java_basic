package test.com;

import test.com.MemberOuter.Bus;
import test.com.MemberOuter.Student;

public class Test01InnerMain {
	
	static String url = "http://java.com";

	public static void main(String[] args) {
		//내부 클래스를 만들어 사용할때 특징
		//외부 클래스의 자원을 객체생성없이 접근할 수 있다. 
		
		System.out.println(url);
		
		//1. 로컬 내부클래스(중첩클래스)
		class Person{
			String name = "kim";
			int age = 33;
			public Person() {
				System.out.println("Person");
			}
			public void sleep() {
				System.out.println("sleep");
			}
		}
		Person p = new Person();
		System.out.println(p);

		
		class Car{
			
		}
		Car c = new Car();
		System.out.println(c);
		
		//2. 익명 내부 클래스 
		//상속이 가능한 클래스가 반드시 존재 해야한다. 
		
		Thread t = new Thread() {};
//		String st = new String() {};	
		Father f = new Father() {};
		
		
		//3. 멤버 내부 클래스_ MemberOuter
		//class in class
		
		MemberOuter o = new MemberOuter();
		System.out.println(o);
		
		Student s = o.new Student();
		System.out.println(s);
		System.out.println(s.name);
		System.out.println(s.kor);
		
		
		//4. 스테틱 내부 클래스
		
		Bus b = new Bus();
		System.out.println(b.money);
		System.out.println(b.count);
	}

}
