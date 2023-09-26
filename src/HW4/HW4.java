package HW4;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		int count=0;
		int[][] x = {{25,2500},{32,500},{8,500},{19,1000},{27,1200}};
		System.out.println("輸入預借金額:");
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		System.out.print("可以借款的有:");
		for(int i=0;i<x.length;i++) {
			if(c<=x[i][1]) {
				count++;
				System.out.print(x[i][0]+" ");
			}
		}
		System.out.print("總共有"+count+"人");
	}
}
