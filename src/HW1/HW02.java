//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
package HW1;

public class HW02 {
public static void main(String[] args) {
int Egg=200,Dozen=12;
int num1=Egg/Dozen,num2=Egg%Dozen;
System.out.println("200顆雞蛋是"+num1+"打,"+"會剩下"+num2+"顆");
}
}