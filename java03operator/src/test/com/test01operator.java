package test.com;

public class test01operator {

	//클래스가 단독으로 실행되기 위해서 필수로 정의해야하는 함수(메소드)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operator... 연산");
		
		//1.산술연산자 , 증감연산
		System.out.println( 10 + 3);
		System.out.println( 10 - 3);
		System.out.println( 10 * 3);
		System.out.println( 10 / 3);
		System.out.println( 10 % 3);
		
		int a = 100;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(--a);
		
		//2.대입연산자
		int x = 10;
		
		//3.복합대입연산자
		x += 10;
		System.out.println(x);
		x -= 10;
		System.out.println(x);
		x *= 10;
		System.out.println(x);
		x /= 10;
		System.out.println(x);
		x %= 10;
		System.out.println(x);
		System.out.println();
		
		x = 10;
		x &= 3;
		System.out.println(x);
		x = 10;
		x |= 3;
		System.out.println(x);
		x = 10;
		x ^= 3;
		System.out.println(x);
		
		System.out.println("======");
		//4.비교연산자 ==,!=,>,<,>=,<=
		System.out.println( 5 == 5);
		System.out.println( 5 >= 5);
		System.out.println( 5 <= 5);
		System.out.println( 5 > 5);
		System.out.println( 5 < 5);
		System.out.println( 5 != 5);
		
		//5.논리연산자 boolean && boolean   ,||, &,|
		System.out.println("======");
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(5==3 && 10==10);
		System.out.println(5==3 & 10==10);
		System.out.println(true & true);
		
		
		System.out.println(true || false);
		System.out.println(true | false);
		
		//6.비트연산자 : 정수 & 정수
		System.out.println("======");
		System.out.println(10 & 3);//1010 & 0011 : 0010<<2
		System.out.println(10 | 3);//1010 & 0011 : 1011<<11
		System.out.println(10 ^ 3);//1010 & 0011 : 1001<<9
		
		//7.쉬프트연산자
		System.out.println("======");
		System.out.println(8 >> 1);
		System.out.println(4 << 1);
		System.out.println(-8 >>> 1);
		
		
		//8.제어연산자(삼항연산자) boolean ? value : value
		System.out.println("======");
		System.out.println( 5==5 ? "kim" : "lee");
		System.out.println( 5==5 && 3 > 5 ? "kim" : "lee");
		System.out.println( 5==5 && 3 > 5 ? 88 : 99);
		
		
		//9.기타연산자 (),,,,,.[],...,new
		System.out.println("======");
		int ap = 65;
		char ch = (char) ap;//캐스팅 연산자
		System.out.println(ch);
		System.out.println( (1+2)*(3+4));//우선연산자
		String str = new String();
		String[] strs = new String[3];
		System.out.printf("%d %d %d",88,77,66);//열거 연산자
		
		

	}//end main
}//end class
