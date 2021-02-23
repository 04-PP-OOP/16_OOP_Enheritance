public class Yard {

	public static void main(String[] args) {
	
	Cat cat = new Cat("Alonzo", "black", 35, false);	
	
	ausgabe(cat.tellYourAttributes("#name"));
	ausgabe(cat.tellYourAttributes("#color"));
	
	ausgabe(cat.tellYourAttributes("#age"));
	ausgabe(cat.tellYourAttributes("#age"));
	
	System.out.println("------------------");

	Cat cat2 = new Cat("Grizabella", "white", 29, true);
	ausgabe(cat2.tellYourAttributes("#name"));
	ausgabe(cat2.tellYourAttributes("#color"));
	
	ausgabe(cat2.tellYourAttributes("#age"));
	ausgabe(cat2.tellYourAttributes("#age"));
	ausgabe(cat2.tellYourAttributes("#age"));
	ausgabe(cat2.tellYourAttributes("#age"));
	
	}
	
	// Statische Methode // statischer Kontext
	public static void ausgabe(String outStr){
		System.out.println(outStr);
	}
	
	
	
}
