package area;

public class BaseArea {
	
	double r;
	
	public BaseArea() {
		r=1;
	}
	
	public BaseArea(double r) {
		this.r=r;
	}
	
	public double getBaseArea() {
		return 3.14*r*r;
	}

}
