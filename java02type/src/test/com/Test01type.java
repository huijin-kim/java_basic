package test.com;

public class Test01type {

	public static void main(String[] args) {
		System.out.println("type");
		
		//1. 기본 타입(원시 타입) - 숫자 관련 타입
		//byte,short,char,int,long,float,double,boolean
		
		//byte - 1byte
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		byte bt = 127;
		System.out.println(bt);
		System.out.println(++bt);
		System.out.println(++bt);
		
		//short - 2byte
		System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		short st = 32767;
		System.out.println(st);
		System.out.println(+st);
		System.out.println(+st);
		
		//char - 2byte : 양수만, 하나의 문자(문자형)
		System.out.println(Character.MIN_VALUE +"~"+Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE +"~"+(int)Character.MAX_VALUE);
		char ch = 65535;
		System.out.println((int)ch);
		ch = 65;
		System.out.println(ch);
		System.out.println((int)ch);
		ch = 'a'; 
		System.out.println(ch);
		System.out.println((int)ch);
		
		//int - 4byte : java에서 기본 정수 타입. 
		System.out.println(Integer.MIN_VALUE+ "~" + Integer.MAX_VALUE);
		int i = 2147483647; //21억
		
		//long - 8byte / 900경
		System.out.println(Long.MIN_VALUE+ "~" + Long.MAX_VALUE);
		long l = 9223372036854775807L;
		System.out.println(l);
		System.out.println(++l);
		System.out.println(++l);
		
		//boolean - true, false
		System.out.println(Boolean.TRUE+ " or "+ Boolean.FALSE);
		boolean bool = false; //0
		System.out.println(bool);
		System.out.println(!bool);
		
		
		//2. 참조타입 - 문자열, 객체, 배열 관련.
		String str = "hello";
		System.out.println(str);
		
		//주소만. 
		String[] strs = {"hello", "hello"};
		System.out.println(strs);
		System.out.println(strs[0]);
		
		String obj = new String("java");
		System.out.println(obj);
		
		Integer ii = 99;
		int x =99;
		System.out.println(ii.doubleValue());
//		System.out.println(x.);
		
		
		//문자를 숫자로 parseInt
		String txt = "100";
		int sum = Integer.parseInt(txt) +99;
		System.out.println(sum);
		
		txt = "100.99";
		double sum2 = Double.parseDouble(txt) + 99;
		System.out.println(sum2);
		
		//final can't change.
		final String name = "kim";
//		name = "lee";
		System.out.println(name);

	}//end main

}//end class
