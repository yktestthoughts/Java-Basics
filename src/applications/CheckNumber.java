package applications;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		
		int x;
		
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		if(x%2==0) {
			System.out.println(x + " is even");
		}
		
		else {
			System.out.println(x + " is odd");
		}

	}

}
