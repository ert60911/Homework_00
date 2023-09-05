//請設計一隻Java程式，輸出結果為以下：
//A 621
//BB 622
//CCC 623
//DDDD 624
//EEEEE 625
//FFFFFF 626

package HW2;

public class HW08 {
public static void main(String[] args) {
	for(int x=1;x<=6;x++) {
		for(int y=1;y<=x;y++) {
			System.out.print((char)( 64+x));
		}
		System.out.println();
	}
}
}