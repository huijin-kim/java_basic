package test.com;

public class My extends Father {
	
	String school_name = "MultiCam";
	
	public My()  {
		super();
		System.out.println("MY()...");
	}
	
	void study() {
		System.out.println("study()...");
		this.sleep();
		super.sleep();
	}
	
	@Override
	void sleep() {
		System.out.println("sleep##");
	}

}
