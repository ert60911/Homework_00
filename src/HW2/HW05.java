//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100

package HW2;

public class HW05 {
public static void main(String[] args) {
	
	for(int i=1;i<=10;i++) {
		System.out.print((int)Math.pow(i, 2)+" ");
	}
}
}
