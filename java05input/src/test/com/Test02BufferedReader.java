package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("input your name");
		
		//한줄. 
		String name = br.readLine();
		System.out.println("name: "+ name);
		
		System.out.println("input your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("age: " +age);

		
		br.close();
	
	}

}
