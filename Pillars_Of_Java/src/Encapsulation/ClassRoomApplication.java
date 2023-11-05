package Encapsulation;

public class ClassRoomApplication {
	public static void main(String[] args) {
		ClassRoom cr = new ClassRoom();
		//cr.temparature=28;---> Prevented Direct Access 
		cr.setTemparature(28);
	    System.out.println("The Temparature is "+cr.getTemparature());
	}
}
