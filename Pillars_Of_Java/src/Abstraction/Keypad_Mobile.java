package Abstraction;

public class Keypad_Mobile extends Mobile {

	@Override
	void capture() {
		System.out.println("Few Keypad mobiles can capture");
		
	}

	@Override
	void gps() {
		System.out.println("GPS feature is not available");
		
	}

	@Override
	void transactions() {
		System.out.println("transactions not available ");
		
	}
	

}
