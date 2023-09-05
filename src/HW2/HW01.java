//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

package HW2;

public class HW01 {
public static void main(String[] args) {
	int x=2,total=0;
	for(int i=0;i<=1000;i+=2) {
		total=total+i;
	}
		System.out.println(total);
}
}
