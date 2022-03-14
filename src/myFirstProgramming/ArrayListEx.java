package myFirstProgramming;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// Classname obj = new CLassname
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding elements to list
		list.add("Maths");
		list.add("Physics");
		list.add("Chemistry");
		list.add("English");
		list.add("computer science");
		
		String subject = "chemistry";
		
		for(String itr: list) {
			System.out.println(itr);
			
			if(subject.equalsIgnoreCase(itr)) {
				System.out.println("Successfully choosen "+ itr);
				break;
			}
			
		}

	}

}
