package area;

public class CurvedSurfaceArea {
	
	double r,l;
	
	public CurvedSurfaceArea() {
		
		r=1;
		l=1;
		
	}
	
	public CurvedSurfaceArea(double r, double l) {
		this.r = r;
		this.l = l;
	}
	
	public double getCsa() {
		double area = 3.14*r*l;
		return area;
		
	}
	
	//Method overloading
	public double getCsa(double s) {
		double area = 4*s;
		return area;
		
	}

	
	
	
	

}
