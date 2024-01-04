package test.com;

public class Test02main4 {

	public static void main(String[] args) {
		System.out.println("constructor....4");

		//게시글 정보를 갖는 객체(Board)를 정의해봅시다.
		//글번호(정수)num,제목(문자열)title,
		//내용(문자열)content,작성자(문자열)writer,
		//작성일자(문자열)wdate
		
		//객체생성 2가지(인자없이,모든인자)
		Board b = new Board();
		System.out.println(b);
		
		Board b2 = new Board(
				99, "java", "Hello java", "yang", "2024-01-03");
		System.out.println(b2);
		
		//객체배열 생성 및 출력
		Board[] bs = new Board[] {b,b2};
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
		
	}//end main

}//end class