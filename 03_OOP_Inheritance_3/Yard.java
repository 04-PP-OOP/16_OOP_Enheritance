public class Yard {

	public static void main(String[] args) {
	
	Tomcat tomcat = new Tomcat("Alonzo", "black", 35);	
	
	ausgabe(tomcat.tellYourAttributes("#name"));
	ausgabe(tomcat.tellYourAttributes("#color"));
	
	ausgabe(tomcat.tellYourAge());
	
	System.out.println("------------------");

	Cat cat = new Cat("Grizabella", "white", 29);
	ausgabe(cat.tellYourAttributes("#name"));
	ausgabe(cat.tellYourAttributes("#color"));
	
	ausgabe(cat.tellYourAge());
	ausgabe(cat.tellYourAge());
	ausgabe(cat.tellYourAge());
	ausgabe(cat.tellYourAge());
	
	}
	
	// Statische Methode // statischer Kontext
	public static void ausgabe(String outStr){
		System.out.println(outStr);
	}
	
	
	
}
