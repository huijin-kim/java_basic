package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04while {

	public static void main(String[] args) throws IOException{
		System.out.println("while");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		boolean bool = true;
//		while(bool) {
//			System.out.println("while");
//			
//			System.out.println("input your name: ");
//			String name = br. readLine();
//			System.out.println("name : " + name);
//			
//			System.out.println("종료시 x입력 ");
//			String x = br.readLine();
//			System.out.println(x);
//			if(x.equals("x")) {
//				break;
//			}
//		}
//		
//		int i =0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		//bool이 false면 동작 안한다. 
		boolean bool = true;
		while(bool) {
			
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
			
			System.out.println("종료시 x입력 ");
			String x = br.readLine();
			System.out.println(x);
			if(x.equals("x")) {
				break;
			}
		} //end while
		
		
		br.close();

	}

}
