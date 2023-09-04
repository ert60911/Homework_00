package HW2;

public class HW02 {
public static void main(String[] args) {
	int sum=0,total=0;
	for(int i=1;i<=10;i++) {
		 sum=(int) Math.pow(i,2 );
		total=total+sum;
	}
	System.out.println(total);
}
}
