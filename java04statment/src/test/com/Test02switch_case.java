package test.com;

public class Test02switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key ="a001";
		
		int key2=9;
		
		switch(key) {
		case "a001" :
			System.out.println("open A");
			break;
		
		case "b001" :
			System.out.println("open B");
			break;
		default:
			System.out.println("byebye");
			break;
		}
		
		switch(key2) {
		case 10 :
			System.out.println("open AA");
			break;
		
		case 9 :
			System.out.println("open BB");
			break;
		default:
			System.out.println("byebye");
			break;
		}
		
		char key3 = 'A';
		switch(key3) {
		case 'A' :
			System.out.println("open AAA");
			break;
		
		case 'B' :
			System.out.println("open BBB");
			break;
		default:
			System.out.println("byebye");
			break;
		}
		
		
	

	}

}
