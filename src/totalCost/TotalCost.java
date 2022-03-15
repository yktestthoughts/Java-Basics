package totalCost;

import area.BaseArea;
import area.CurvedSurfaceArea;

public class TotalCost {

	public static void main(String[] args) {
		
		BaseArea ba = new BaseArea(2.5);
		CurvedSurfaceArea csa = new CurvedSurfaceArea(2.5,5);
		
		double totalArea = ba.getBaseArea() + csa.getCsa();
		System.out.println("Total area : "+ totalArea);
		System.out.println("Total cost: "+ 50* totalArea);
		
		System.out.println(csa.getCsa(5.0));
	}

}
