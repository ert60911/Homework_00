//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，
//即會印出對應的*長方形，如圖：

package HW5;

import java.util.Scanner;

public class HW1 {
		
		public static void starSquare(int width,int height) {
			for(int i=0;i<height;i++) {
				for(int j=0;j<width;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
		public static void main(String[] args) {
			int width,height;
			
		 while(true) {
			 System.out.println("請輸入寬與高為你繪製圖案:");
			 Scanner sc= new Scanner(System.in);
			 width = sc.nextInt();
			 height = sc.nextInt();
			 starSquare(width,height);
			 if(width<0 || height<0) {
				 System.out.println("輸入錯誤，請重新輸入寬與高:");
			 }else {
				 break;
			 }
			 
		 }
		}
}
