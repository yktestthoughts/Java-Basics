package applications;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = input.nextInt(); //10
		System.out.println("Enter num2");
		num2 = input.nextInt();
		
		int sum = num1+num2;
		System.out.println("sum: "+ sum);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
	}

}
