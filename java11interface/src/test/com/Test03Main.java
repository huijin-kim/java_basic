package test.com;

public class Test03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BoardVO 임의의 값을 세팅 - 세터를 사용할 것 
		BoardVO vo = new BoardVO();
		System.out.println(vo);
		
		BoardVO vo2 = new BoardVO(1, "java", "hello", "admin", "2024-01-05");
		System.out.println(vo2);
		
		BoardVO vo3 = new BoardVO();
		vo3.setNum(3);
		vo3.setTitle("jsp");
		vo3.setContent("web");
		vo3.setWriter("tester");
		vo3.setWdate("2024-01-04");
		
		System.out.println(vo3);
		
		//BoardAbs 객체생성 활용하기. 
		BoardAbs abs = new BoardAbsEx();
		int result = abs.insert(vo3);
		System.out.println(result);
		
		//익명내부 클래스 활용하기 
		BoardAbs abs2 = new BoardAbs() {
			@Override
			public int insert(BoardVO vo) {
				// TODO Auto-generated method stub
				System.out.println("insert()....2");
				System.out.println(vo);
				return 0;
			}
		};
		
		result = abs2.insert(vo3);
		System.out.println(result);
		
		
		//BoardInter 객체생성 활용하기.
		BoardInter inter = new BoardInterImpl();
		result = inter.update(vo3);
		System.out.println(result);
		
		//익명내부 클래스 활용하기.
		BoardInter inter2 = new BoardInter() {
			@Override
			public int update(BoardVO vo) {
				System.out.println("update()..2");
				System.out.println(vo);
				return 0;
			}

			@Override
			public BoardVO selectOne(BoardVO vo) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BoardVO[] searchLlist(BoardVO vo) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BoardVO[] searchLlist(String searchKey, String searchWord) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		result = inter2.update(vo3);
		System.out.println(result);
		
		
		System.out.println("--------");
		BoardVO vo4 = new BoardVO();
		vo4.setNum(22);
		
		BoardVO one = inter2.selectOne(vo4);
		System.out.println("one");
		
		System.out.println("---searchLlist-----");
		
		BoardVO vo5 = new BoardVO();
		vo5.setWriter("tester");
		
		BoardVO[] vos = inter.searchLlist(vo5);
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i]);
		}
		
		System.out.println("---searchLlist--2---");
		
		vos = inter.searchLlist("title", "java");
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i]);
		}
		
		//매개변수 관련 추가문법.
		//매개변수의 타입이 모두 동일한 상태에서 개수가 정해지지 않은 상황을 고려한 문법
		test(11,22);
		test(11,22,33);
		test(11);
		
	}

	private static void test(int ... arr) {
		// TODO Auto-generated method stub
		System.out.println("test()....");
		
	}
}




