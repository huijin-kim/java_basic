package test.com;

public class Member {

	private int num;
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int num, String id, String pw, String name, String tel) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

}