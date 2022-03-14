package myFirstProgramming;

import java.util.Hashtable;

public class HashsetEx {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hash = new Hashtable<>();
		
		hash.put(1, "Apple");
		hash.put(2, "Orange");
		
		System.out.println(hash.get(1));

	}

}
