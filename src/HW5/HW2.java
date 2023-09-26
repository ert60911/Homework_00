//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

package HW5;

public class HW2 {
	private static int sum;
	private static int ran;

	public static void randAvg(){
		System.out.println("本次亂數結果如下:");
		for(int i=0;i<10;i++) {
				ran = (int) (Math.random()*101);
				System.out.print(ran+" ");
				sum+=ran;
		}
		System.out.print("\n"+"平均值為"+sum/10);
	}
	public static void main(String[] args) {
		randAvg();
	}
}
