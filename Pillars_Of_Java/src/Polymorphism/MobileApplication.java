package Polymorphism;
public class MobileApplication {
	public static void main(String[] args) {
		MobileShop ms = new MobileShop();
		System.out.println("keypad phone Details");
		ms.getReferenceType(new Keypad_phone());
		System.out.println();
		Smart_Phone sp = new Smart_Phone();
		System.out.println("Smartphone Details");
		ms.getReferenceType(new Smart_Phone());
		
	}
}
