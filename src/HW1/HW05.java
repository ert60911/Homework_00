//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後
//本金加利息共有多少錢 (用複利計算，公式請自行google)
//FV (Future Value)：未來的價值，亦即指最後的金額
//PV (Present Value)：現值，亦即指本金
//i：利率或預期的回報率
//n：期數
package HW1;
public class HW05 {
public static void main(String[] args) {
double Pv=1500000,i=1.02,s=0;
double total=0,sum=0;

sum=Pv*Math.pow(i,10);
	 
System.out.println("本金加利息金額為"+sum);
}
}
