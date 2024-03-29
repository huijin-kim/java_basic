package test.com;

public class BoardVO {
	
	//VO : value object (DTO, TO)
	
	private int num;
	private String title;
	private String content;
	private String writer;
	private String wdate;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardVO(int num, String title, String content, String writer, String wdate) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.wdate = wdate;
	}
	

	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getWdate() {
		return wdate;
	}



	public void setWdate(String wdate) {
		this.wdate = wdate;
	}



	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + ", wdate="
				+ wdate + "]";
	}
	
	
	
	
	

}
