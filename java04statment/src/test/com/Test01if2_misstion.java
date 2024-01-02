package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01if2_misstion {

	public static void main(String[] args) throws IOException {
		
		//버퍼드리더를 사용해 구현 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름: ");
		String name = br.readLine();
		
		
		System.out.println("국어: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("영어: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.println("수학: ");
		int math = Integer.parseInt(br.readLine());
		
		int sum =0;
		sum = kor +eng +math;
		float avg =0 ;
		avg = sum/3;
		
		String rank;
		
		if(avg >90) {
			rank ="A";
		} else if(avg>80) {
			rank ="B";
		} else if(avg>70) {
			rank ="C";
		} else if(avg>60) {
			rank ="D";
		} else if(avg>50) {
			rank ="E";
		} else {
			rank ="F";
		}
		
		System.out.println(name + " 국어(" + kor +")," + "영어(" +eng+"), " + "수학("+ math + "),"
				+"총점("+ sum +")," + "평균("+avg+"),"+"등급("+ rank +")");


	}// end main

}// end class
