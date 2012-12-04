package code;

public class Hello {
	
	
	private Goodbye goodbye = new Goodbye();

	public String hello() {
		
		return "Hello";
	}

	public String goodbye() {
		return goodbye.getGoodbye();
	}
	
	

}
