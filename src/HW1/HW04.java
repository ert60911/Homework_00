//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
package HW1;

public class HW04 {

public static void main(String[] args) {
	double Pi=3.1415,Half=5;
	double Sum1=Half*Half*Pi,Sum2=Half*2*Pi;
	System.out.println("圓的面積是"+Sum1+"，圓的週長是"+Sum2);
}
}