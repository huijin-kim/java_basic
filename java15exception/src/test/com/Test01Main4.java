package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main4 {

	public static void main(String[] args) {
		System.out.println("Exception....");

		// 프로그램 컴파일 또는 실행시에 발생할 수 있는 오류에 대해 대처하는 문법

		// throws 예외전가
		try {
			test01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test02();

		System.out.println("end..main...");
	}// end main

	private static void test02() {
		BufferedReader br = null;
		InputStreamReader isr = null;
		InputStream is = null;
		try {
			System.out.println(10/0);
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String name = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}//end finally
		
	}

	private static void test01() throws Exception {
		
		System.out.println(10/0);
	}

}// end class
