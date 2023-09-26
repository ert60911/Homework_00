//• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//  例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//  (提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

package HW4;

import java.time.LocalDate;
import java.util.Scanner;

public class HW5 {
		public static void main(String[] args) {
			
			int year,month,day;
			int sumday=0,totalday=0;
			int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
			Scanner sc= new Scanner(System.in);
			while(true) {
			System.out.println("請輸入YYYY年:");
			year=sc.nextInt();
			System.out.println("請輸入MM月:");
			month = sc.nextInt();
			System.out.println("請輸入DD日:");
			day = sc.nextInt();
			
			if(year%4==0 && (year% 100 ==0 || year% 400 ==0)) {
				if(month ==2) {
					if(day>29) {
						System.out.println("輸入錯誤，請重新輸入");
					}else {
						break;
					}
				}else if(month<1 || month >12) {
					System.out.println("輸入錯誤，請重新輸入");
				}else if(day<1 || day >mon[month]) {
					System.out.println("輸入錯誤，請重新輸入");
				}else {
					break;
				}
				
			}else {
				if(month ==2) {
					if(day>28) {
						System.out.println("輸入錯誤，請重新輸入");
						}else {
						break;
				}
			}else if(month<1 || month >12){
				System.out.println("輸入錯誤，請重新輸入");
			}else if (day<1 || day>mon[month]) {
				System.out.println("輸入錯誤，請重新輸入");
			}else{
				break;
			}
			}
			}
			if(year%4==0 && (year% 100 ==0 || year% 400 ==0)) {
				mon[1]=29;
				}
			for(int x=0;x<(month-1);x++) {
				sumday+=mon[x];
			}
			totalday=sumday+day;
			System.out.println("輸入的日期為該年第"+totalday+"天");
		}
}
