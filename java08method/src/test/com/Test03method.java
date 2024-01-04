package test.com;

public class Test03method {

	public static void main(String[] args) {
		System.out.println("method....3");
		
		//Store 클래스
		//커피값 200원
		//getCount(구매하려는 돈) 리턴 커피 몇개 구입가능 잔돈 100원 이라고 반환하는 프로그램.
		
		Store st = new Store();
		System.out.println(st.getCount(900));
		
		//Store 클래스
		//상품목록얻기(3개) : 리턴 임의의 상품목록 배열 반환(예:과자,음료수,껌)
		//전제상품은 5개가 준비되어있습니다.(과자,음료수,커피,껌,아이스크림)
		//랜덤하게 과자를 뽑아서 원하는 개수의 배열로 반환(중복되어도 상관없음)
		String[] list = st.getProductList(3);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		//회원클래스 (번호,아이디,비번,이름,폰번)
		//회원처리 클래스 - 회원목록보기() : 회원배열 
		//회원정보는 임의의 값으로 설정할것
		//반환되는 회원수는 3개로 정할것
		//메인함수 에서는 3명의 회원정보를 출력하기
		
		MemberPro mp = new MemberPro();
		Member[] ms =  mp.listMember();
		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i]);
		}
		
		BoardPro bp = new BoardPro();
		Board[] bs = bp.listBoard();
		for(int i =0; i<bs.length; i++) {
			System.out.println(bs[i]);
		}
		
	}// end main

}// end class