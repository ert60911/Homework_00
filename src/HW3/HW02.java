//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)


package HW3;

import java.util.Scanner;

public class HW02 {
public static void main(String[] args) {
	int x=(int)(Math.random()*100)+1;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("猜數字遊戲開始，");
	while(true) {
		System.out.println("請輸入0～100的數字:");
		int ans= sc.nextInt();
		if(ans<1 || ans>100) {
			System.out.println("輸入錯誤，請重新輸入0~100:");
		}else if(ans>x){
			System.out.println("大於正確答案");
		}else if(ans<x){
			System.out.println("小於正確答案");
		}else { 
			System.out.println("恭喜你!答對了");
		break;
	}
	
	
	}
}
}
