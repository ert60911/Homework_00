//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

package HW3;
import java.util.Arrays;
import java.util.Scanner;

public class HW01 {
public static void main(String[] args) {
	double x,y,z;
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入第一個正整數:");
	x=sc.nextDouble();
	System.out.println("請輸入第二個正整數:");
	y=sc.nextDouble();
	System.out.println("請輸入第三個正整數:");
	z=sc.nextDouble();
	if(Triangle(x,y,z)) {
		if(x==y&&y==z&&x==z) {
			System.out.println("正三角形:");
		}else if(x==y||y==z||z==x){
			System.out.println("等腰三角形:");
		}else if(rightTri(x,y,z)) {
			System.out.println("直角三角形:");
		}else {
			System.out.println("其他三角形:");
		}
		
		
	}else {
	System.out.println("不是三角形:");
	}
}



public static boolean Triangle(double a,double b,double c) {
	return a+b>c && a+c>b && b+c>a ;
}
public static boolean rightTri(double a,double b,double c) {
	double[] array= {a,b,c};
	Arrays.sort(array);
	return array[2]*array[2]==array[0]*array[0]+array[1]*array[1];
}
}