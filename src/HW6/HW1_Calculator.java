package HW6;

import java.util.Scanner;

public class HW1_Calculator {
	Scanner sc = new Scanner(System.in);
	private int x;
	private int y;
	
	public int getx() {
		System.out.println("請輸入x的值");
		if(x<0) {
			System.out.println("格式錯誤，請重新輸入");
				}
		x=sc.nextInt();
		return x;
		}
	public int gety() {
		System.out.println("請輸入y的值");
		if(y<0) {
			System.out.println("格式錯誤，請重新輸入");
				}
		y=sc.nextInt();
		return y;
	}
	public int powerXY(int x,int y) throws HW1_CalException{
		if (x == 0 && y == 0) {
			throw new HW1_CalException ("0的0次方沒有意義!");
		}else if(y<0){
			throw new HW1_CalException("次方為負值，結果回傳不為整數");
		}else
			return (int)Math.pow(x, y);
		}
	}

