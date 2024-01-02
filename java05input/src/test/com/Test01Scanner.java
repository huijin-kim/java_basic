package test.com;

import java.util.Scanner;

public class Test01Scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("input your name");
		
		String name = sc.next();
		System.out.println("name: "+ name);
		
		System.out.println("input your movie:");
		String title = sc.next();
		System.out.println("title:"+title);
		
		System.out.println("input your age:");
		int age = sc.nextInt();
		System.out.println("age:"+age);
		
		sc.close();
		
	}

}
