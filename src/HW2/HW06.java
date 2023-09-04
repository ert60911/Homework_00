package HW2;

public class HW06 {
public static void main(String[] args) {
	int x=4;
	for(int i = 1;i<=49;i++) {
		if(String.valueOf(i).indexOf(x)==-1) {
			System.out.println(i);
		}
	}
	
}
}
