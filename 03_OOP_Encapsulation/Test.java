
public class Test {

	private String testStr = "Hallo";
	
	
	// Getter
	public String getTestStr(){
		if (this.hasPermission()) {
			return this.testStr;
		} else {
			return "Sorry, no permission!";
		}
	}
	
	// Setter
	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	
	private boolean hasPermission() {
		// Test ....
		return true;
	}
	
	
	
	
}
