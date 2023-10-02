package HW6;

import java.util.Scanner;

public class HW1_CalTest {
	public static void main(String[] args) {
		HW1_Calculator c = new HW1_Calculator();
		int x = 0 , y = 0 ;
		c.getx();
		c.gety();
		
		try {
			System.out.println(x+"的"+y+"次方等於"+c.powerXY(x, y));
		}catch (HW1_CalException e) {
			System.out.println(e.getMessage());
		}
}
}
