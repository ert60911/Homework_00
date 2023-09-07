////阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
////輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

package HW2;

public class HW05 {
public static void main(String[] args) {
////	int[] intArray= {4,14,24,34,40,41,42,43,44,45,46,47,47,48,49};
////		for(int i=1;i<=49;i++) {
////			if(i != intArray[14]) {
////				System.out.print(i+" ");
////			}
//			
//		
//	}
//}
//}
//		
	int x=0;
	for(int i=1;i<=49;i++) {
		
		if(i%10==4) {
			continue;
		}if(i>=40)
			continue;
		x++;
		System.out.print(i+" ");
	}
	System.out.println("總共有"+x+"個");
}
}


