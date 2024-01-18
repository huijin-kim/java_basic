package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01Main2 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");
		
		//상속관
		//Car <-- Bus <-- BigBus
		//Car <-- Taxi <-- BigTaxi
		
		List<Car> cars = new ArrayList<Car>();
		
		cars.add(new Car());
		cars.add(new Bus());
		cars.add(new BigBus());
		cars.add(new Taxi());
		cars.add(new BigTaxi());
		
		System.out.println(cars);
		
		//-------
		
		List<Bus> cars2 = new ArrayList<Bus>();
		
		//cars2.add((Bus)new Car());
		cars2.add(new Bus());
		cars2.add(new BigBus());
//		cars2.add(new Taxi());
//		cars2.add(new BigTaxi());
		System.out.println(cars2);
		
		
		//--
		
		List<Taxi> cars3 = new ArrayList<Taxi>();
		
		//cars3.add((Bus)new Car());
//		cars3.add(new Bus());
//		cars3.add(new BigBus());
		cars3.add(new Taxi());
		cars3.add(new BigTaxi());
		System.out.println(cars3);
		
		
		List<BigBus> cars4 = new ArrayList<BigBus>();
//		cars4.add((BigBus)new Bus());//컴파일 오류X,실행시오류
		cars4.add(new BigBus());
		System.out.println(cars4);
		System.out.println("============");
		
		List<BigTaxi> cars5 = new ArrayList<BigTaxi>();
//		cars5.add((BigTaxi)new Taxi());//컴파일 오류X,실행시오류
		cars5.add(new BigTaxi());
		System.out.println(cars5);
		System.out.println("============");
		
		
		
		
	}//end main

}//end class
