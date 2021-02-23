
public class SuperCat {

	// Property | Attribut | Field
	private String name;
	private String furColor;
	protected int age;
	
	public SuperCat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}

	protected String tellYourAttributes(String flag){		
		switch (flag) {
		case "#name":
			return this.name; 		
		case "#color":
			return this.furColor;		
		default:
			return "Something went wrong!";		
		}		
	}

}
