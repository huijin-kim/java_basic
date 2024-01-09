package test.com;

import java.util.List;

public class Test04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection...");
		
		//BoardVO >> 배열처리를 가변배열 >> List<BoardVO>
		
		//BoardDAO >> 게시글 처리용 객체 : 인터페이스로 만들기.
		//추상메소드 + selectAll(BoardVO) : List<BoardVO>
		
		//BoardDAOimpl >> BoardDAO 인터페이스를 상속받은 클래스 만들기.
		
		//메인함수에서는 각 객체를 생성 및 함수 호출 후 반환 값 출력. 
		
		BoardVO vo = new BoardVO();
		
		vo.setNum(1);
		vo.setTitle("java");
		vo.setContent("hello");
		vo.setWriter("he");
		vo.setWdate("2024-01-05");
		
		BoardDAO dao = new BoardDAOimpl();
		
		List<BoardVO> list = dao.selectAll(vo);
		System.out.println("list : " + list.size());
		
		for (BoardVO x : list) {
			System.out.println(x);
		}
		
		//MemberVO 를 만들고
		//위에 BoardVO를 이용한 미션과 같이 처리되는 프로그램 작성하기
		
		MemberVO mvo = new MemberVO() ;
		mvo.setNum (1);
		mvo.setId ("admin");
		mvo.setPw ("'hil11");
		mvo. setName ("kim");
		mvo.setTel ("011");
		
		MemberDAO mdao = new MemberDAOimpl();
		List<MemberVO> mvos = mdao.selectAll(mvo);
		System.out.println("mvos.size():"+mvos.size());
		
		for(MemberVO x : mvos) {
			System.out.println(x);
		}
		
		
		mvos = mdao.selectAll();
		System.out.println("mvos.size():"+mvos.size());
		
		for(MemberVO x : mvos) {
			System.out.println(x);
		}
		
		
		

	}

}
