//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

package HW4;

public class HW1 {
	public static void main(String[] args) {
		int[] ar = {29,100,39,41,50,8,66,77,96,15};
		double avg = 0,sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum +=ar[i];
		}
		avg = sum/ar.length;
		System.out.println("所有元素平均值為=" + avg);
		System.out.println("大於平均值的元素有:");
		
		for(int i = 0;i<ar.length;i++) {
			if(ar[i]>avg) {
				System.out.print(ar[i]+" ");
			}
		}
}
}
