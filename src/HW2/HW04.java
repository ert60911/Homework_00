//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
package HW2;

public class HW04 {
public static void main(String[] args) {
	int i=1,sum=1,total=0;
	while(i<=10) {
			sum=sum*i;
			total+=sum;
			i++;
	}
	System.out.println(sum);
}
}
