public class Cat extends SuperCat{

	// Property | Attribut | Field
	private int level;	

	public Cat(String name, String furColor, int age) {
		super(name, furColor, age);
	}

	public String tellYourAge() {
		return checkEscalationLevel();
	}
	
	private String checkEscalationLevel(){
		
		// 1. --> "This is an inappropriate question!"
		// 2. --> "I've told you once!"
		// 3. --> "Talk to the hand!"
		// 3. --> "something else ..."
			
		this.level++;  // +1
		
		switch (this.level) {
			case 1:
				return "This is an inappropriate question!";			
			case 2:
				return "I've told you once!";			
			case 3:
				return "Talk to the hand!";
			default:
				return "something else ...";			
		}
	}
	
	
}
