//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)


package HW3;

import java.util.Scanner;

public class HW03 {
//public static void main (String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int x=sc.nextInt();
//	
//	if(x<0 || x>49) {
//		System.out.println("輸入錯誤，請重新輸入:");
//	}else if(true) {
//		
//		
//	}
//}
//public int[] getrandom() {
//	int[] array= new int [6];
//	for (int i=0;i<6;i++) {
//		array[i]=(int) ((Math.random()*49)+1);
//		for(int j=0;j<i;j++) {
//			if(array[i]==array[j]) {
//				i--;
//				break;
//		
//				
//			}
//	}
//		return array;
//	}
//	
//System.out.print(array[6]+"");
//
//}
	
	public static void main (String[] args) {
    Scanner notin=new Scanner(System.in);
    int num=0;
	System.out.println("請輸入你不要的數字1~9");
	int x=notin.nextInt();
	for(int i=1;i<=49;i++) {
		if(!(i/10==x || i%10==x)) {
			System.out.print(i+"\t");
			num++;
		}
		if(i%10==0) {
			System.out.println();
		}
			
			
		}
	System.out.println();
	System.out.println("總共有"+ num +"個數字可以選擇");
	}
		
	}
	
