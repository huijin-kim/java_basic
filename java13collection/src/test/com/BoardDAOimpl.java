package test.com;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public List<BoardVO> selectAll(BoardVO vo) {
		System.out.println("selectAll()...");
		System.out.println(vo);
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		for (int i =0; i<5; i++) {
			
			BoardVO vo2 = new BoardVO();
			
			vo2.setNum(2+i);
			vo2.setTitle("java2"+i);
			vo2.setContent("hello2"+i);
			vo2.setWriter("he2"+i);
			vo2.setWdate("2024-01-05"+i);
			
			list.add(vo2);
			
		}
		
		
//		
//		vo2 = new BoardVO();
//		
//		vo2.setNum(3);
//		vo2.setTitle("java3");
//		vo2.setContent("hello3");
//		vo2.setWriter("he3");
//		vo2.setWdate("2024-01-05");
//		
//		list.add(vo2);
		
		return list;
	}

}
