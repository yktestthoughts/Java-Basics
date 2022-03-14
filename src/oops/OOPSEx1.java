package oops;

class Animal{
	
	//Attributes
	String color = "red";
	String sound = "Bow";
	
	public void showColor() {
		System.out.println(color);
	}
	
	public void getSound() {
		System.out.println(sound);
	}
	
}


public class OOPSEx1 {
	
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		//dog.showColor();
		//dog.getSound();
		System.out.println(dog.color);
		
	}

}
