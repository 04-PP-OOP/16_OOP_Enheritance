
public class Start {

	public static void main(String[] args) {
		
	Test test = new Test();
	
	
	ausgabe(test.getTestStr());
	test.setTestStr("hi");
	ausgabe(test.getTestStr());
	
	

	}
	
	
	private static void ausgabe(String outStr){
		System.out.println(outStr);
	}

}
