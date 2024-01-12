package test.com.board;

import java.util.List;

import test.com.member.MemberVO;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Board...");
		
		BoardDAO dao = new BoardDAOimpl();
		
		//1. insert
		BoardVO vo = new BoardVO();
		
		vo.setNum(1);
		vo.setId("th1");
		vo.setPw("p1");
		vo.setName("n1");
		vo.setTel("01");
		
		int result = dao.inseart(vo);
		System.out.println("result: " +result);
		
		
		//4. selectOne
		vo = new BoardVO();
		vo.setNum(1);
		vo.setId("th1");
		vo.setPw("p1");
		vo.setName("n1");
		vo.setTel("01");
		
		BoardVO vo2 = dao.selectOne(vo);
		System.out.println("vo2 : " +vo2);
		
		//5. selectAll
		
		List<BoardVO> vos = dao.selectAll();
		for(BoardVO x : vos) {
			System.err.println(x);
		}
		
		//6. searchList
		vos = dao.searchList("name", "kim");
		for(BoardVO x : vos) {
			System.out.println(x);
		}

	}

}
