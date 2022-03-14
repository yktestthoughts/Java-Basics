package oops;


class ConstructorEx{

	//Instant Variable
	int x,y;
	
	//Default Constructors
	public ConstructorEx() {
		
		x=1;
		y=2;
		
	}
	
	//Parameterized constructor
	public ConstructorEx(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public void getSum() {
		//Local variable
		//int z = 2;
		System.out.println(x+y);
	}
	
}



public class OOPSEx3 {

	public static void main(String[] args) {
		
		ConstructorEx con = new ConstructorEx();
		System.out.println("Default");
		con.getSum();
		
		//Polymorphism: Executing an action in different ways.
		ConstructorEx con1 = new ConstructorEx(5,10);
		System.out.println("Parameterized");
		con1.getSum();

	}

}
