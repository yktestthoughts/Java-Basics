package inheritence;

public class ChildClass extends ParentClass{
	
	int y = 30;
	
	void getXY() {System.out.println("Parent property: "+ x);
				  System.out.println("Child property: "+ y);}
	
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.getXY();
		cc.getX();
		
	}

}
