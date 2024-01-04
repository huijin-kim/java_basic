package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01array8 {

	public static void main(String[] args) throws IOException {
		System.out.println("array8....");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] scores = new String[3][0];
		
		for(int i =0; i<scores.length; i++) {
			System.out.println("이름 : ");
			String name = br.readLine();
			
			
			System.out.println("국어");
			String kor = br.readLine();
			
			System.out.println("영어");
			String eng = br.readLine();
			
			System.out.println("수학");
			String math = br.readLine();
			
			int total = Integer.parseInt(kor) +
					Integer.parseInt(eng) +
					Integer.parseInt(math);
			
			double avg = total/3.0;
			
			String grade;
			if(avg>=90) {
				grade = "A";
			}else if (avg>=80) {
				grade = "B";
			}else if (avg>=70){
				grade = "C";
			}else if (avg>=60){
				grade = "D";
			}else if (avg>=50){
				grade = "E";
			}else {
				grade = "F";
			}
			
			String[] score = new String[] {name, kor, eng, math, total + "", 
											String.valueOf(avg), grade};
			
			scores[i] =score;
		}
		
		for(int x =0; x<scores.length; x++) {
			for (int i = 0; i < scores[0].length; i++) {
				System.out.print(scores[0][i] + " ");
			}
			System.out.println();
		}
		
	}//end main

}//end class
