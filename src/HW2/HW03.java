//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)


package HW2;

public class HW03 {
public static void main(String[] args) {
int i=1,total=0,sum=0;
while(i<=10) {
	sum=(int)Math.pow(i, 2);
	total=total+sum;
	i++;
}
System.out.println(total);

}
}