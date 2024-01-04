package test.com;

public class Student {
	
	//1.속성-attribute,property,전역변수,member field
	String name;//전역변수는 선언만해도 기본값이 할당됨.null
	int kor;//0
	int eng;//0
	int math;//0
	int total;//0
	double avg;//0.0
	String grade;//null
	
	public Student() {
		System.out.println("Student()....");
		String name = "yang";
		//속성의 초기화 - 전역변수의 초기화
		this.name = "lee";
		kor = 11;
		eng = 22;
		math = 33;
		total = kor+eng+math;
		avg = total/3.0;
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(this.avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
	}//end Student()

	//생성자는 클래스의 이름과 반드시 동일한 이름을 사용해야한다.
	//따라서 생성자를 구분하기위해서는 매개변수의 개수,타입,순서가 달라야한다 << 오버로딩
	public Student(String name, int kor, int eng, int math) {
		System.out.printf("%s,%d,%d,%d\n",name,kor,eng,math);
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(this.avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
	}
	
	

	//속성정보를 반환해주는 메소드
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + ", grade=" + grade + "]";
	}

	
	
	
	

}//end class