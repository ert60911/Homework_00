package HW5;

public class HW4_MyRectangle {
	private double width;
	private double depth;
	
	public HW4_MyRectangle() {
	}
	public HW4_MyRectangle(double width,double depth) {
		this.width=width;
		this.depth=depth;
	}
	public  double getwidth() {
		return width;
	}
	public void setwidth(double width) {
		this.width=width;
	}
	public double getdepth() {
		return depth;
	}
	public void setdepth(double depth) {
		this.depth=depth;
	}
	public double getArea() {
		double area=width * depth ;
		return area;
	}
}
