package HW5;

public class HW4_MyRectangleMain {
	public static void main(String[] args) {
		
		System.out.println("使用public MyRectangle()建構子建立物件");
		HW4_MyRectangle area1 = new HW4_MyRectangle();
		area1.setwidth(10);
		area1.setdepth(20);
		System.out.println(area1.getArea());
		System.out.println("========================");
		
		System.out.println(" 使用public MyRectangle(double width, double depth)建構子建立物件");
		HW4_MyRectangle area2= new HW4_MyRectangle(10,20);
		System.out.println(area2.getArea());
	}
}
