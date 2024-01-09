package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test01Main_list2 {
	
	public static void main(String[] args) {
		System.out.println("Collection 자료구조");

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		String[] strs = new String[5];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "kim"+i;
		}
		
//		List<String> list2 = new ArrayList<String>();
//		for (int i = 0; i < strs.length; i++) {
//			list2.add(strs[i]);
//		}
//		System.out.println(list2);
		
		List<String> list2 = Arrays.asList(strs);
		System.out.println(list2);
		
//		strs = Arrays.copyOf(strs, 3);//0번부터 몇개 복사
		strs = Arrays.copyOfRange(strs,1, 3);//n1번부터 n2이전까지만 복사
		list2 = Arrays.asList(strs);
		System.out.println(list2);
		
		String[] strs2 = new String[7];
		Arrays.fill(strs2,"lee");//모든 아이템 한꺼번에 채우기
		list2 = Arrays.asList(strs2);
		System.out.println(list2);
		
		Integer[] sus = new Integer[] {33,22,11,55,44};
		
		Arrays.sort(sus, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2; //내림차 정렬 
				
				//return o1.compareTo(o2);//순정렬
			}
		});
		
	}//end main

}//end class

