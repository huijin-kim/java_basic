package test.com;

public class Test02main {

	public static void main(String[] args) {
		System.out.println("constructor....");

		Student st = new Student();
		System.out.println(st);
		
		//전달인자의 개수,타입,순서를 다르게전달할 수 있다.
		Student st2 = new Student("kim",99,88,77);
		System.out.println(st2);
		
		
		Student st3 = new Student("yang",44,55,66);
		System.out.println(st3);
		
		
		
		
	}//end main

}
