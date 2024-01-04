package test.com;

import java.util.Iterator;

public class Test01array02 {

	public static void main(String[] args) {
		System.out.println("array.... 2");
		
		String[] strs = new String[] {"java", "html", "js"};
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		System.out.println();
		
		strs[0] = "jsp";
		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
			
		}
		System.out.println();
		
		double[] ds = new double[] {1.2, 2.2, 3.2};
		
		for(int i=0; i<ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		char[] cs = new char[] {'a','b','c'};
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		
		

	}

}
