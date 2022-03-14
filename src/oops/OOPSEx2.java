package oops;

class Calculator{
	
	//double num1, num2;
	
	//Addition
	public double getSum(double a, double b) {
		return a+b;
	}
	
	
	//Sub
	public static double getDiff(double a, double b) {
		return a-b;
	}
	
	
	
	//Mult
	public double getProd(double a, double b) {
		return a*b;
	}
	
	//Div
	public double getDiv(double a, double b) {
		return a/b;
	}
	
	
}


public class OOPSEx2 {

	public static void main(String[] args) {
		
		//Non static method = Need to declare object = objname.method()
		Calculator calc = new Calculator();
		System.out.println(calc.getSum(10, 5));
		
		// Calling static method = Classname.method()
		System.out.println(Calculator.getDiff(10, 5));
	}

}
