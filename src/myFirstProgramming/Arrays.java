package myFirstProgramming;

public class Arrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		//System.out.println(a[1]);
		
		//Print values one by one
		
		for(int i=0; i<a.length;i++) {
			System.out.println("element corresponding to index"+i+": "+a[i]);
		}
		
		for(int itr:a) {
			System.out.println(itr);
		}

	}

}
