package test.com;

import java.util.Random;

public class Store {
	
	int coffee_price = 200;
	
	String getCount(int money) {
	System.out.println("getCount()..."+money);
	int count = money/coffee_price;
	int change = money%coffee_price;
	return "커피 "+count+"개 구입가능, 잔돈 "+change+"원";
	}
	String[] getProductList(int count) {
		System.out.println("getProductList(int count)..."+count);
		String[] list_all = new String[] {"과자","음료수","커피","껌","아이스크림"};
		
		String[] list = new String[count];
		Random r = new Random();
		
		
		for (int i = 0; i < list.length; i++) {
			int index = r.nextInt(list_all.length);
			System.out.println(index);
			System.out.println(list_all[index]);
			list[i] = list_all[index];
		}
		
		return list;
	}

}
