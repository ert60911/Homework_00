//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
package HW1;
public class HW03 {
public static void main(String[] args) {
	int Sec=256559,Min=60,Hou=3600,Day=86400;
	int Num1=Sec/Day,Num2=Sec%Day,Num3=Num2/Hou,Num4=Num2%Hou;
	int Num5=Num4/Min,Num6=Num4%Min;
	System.out.println(Sec+"是"+Num1+"天，"+Num3+"小時，"+Num5+"分，"+Num6+"秒");
}
}


// 60秒一分 3600秒一小時 86400秒一天