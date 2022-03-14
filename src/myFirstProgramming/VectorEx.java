package myFirstProgramming;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
	
		Vector<Integer> num = new Vector<>();
		num.add(1);
		num.add(2);
		
		for(Integer i:num) {
			System.out.println(i);
		}
		
	}

}
