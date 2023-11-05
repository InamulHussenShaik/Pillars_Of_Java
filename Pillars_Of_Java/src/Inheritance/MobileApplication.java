package Inheritance;
public class MobileApplication {
	public static void main(String[] args) {
		keypad_Phone kp = new keypad_Phone();
		System.out.println("Keypad phone Details");
		kp.calls();
		kp.chat();
		kp.capture();
		kp.gps();
		kp.transactions();
		System.out.println();
		System.out.println("Smartphone Details");
		Smart_Phone sp = new Smart_Phone();
		sp.calls();
		sp.chat();
		sp.capture();
		sp.gps();
		sp.transactions();	
	}
}
