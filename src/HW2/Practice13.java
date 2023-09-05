package HW2;

public class Practice13 {
	
 static int  Random() {
		int  r =(int)(Math.random()*31);
		return r;
	}
public static void main(String[] args) {
	
	int r=Random();
	int[][] x = new int [3][3];
	x[0][0]=(int)(Math.random()*31);x[0][1]=(int)(Math.random()*31);x[0][2]=(int)(Math.random()*31);
	x[1][0]=(int)(Math.random()*31);x[1][1]=(int)(Math.random()*31);x[1][2]=(int)(Math.random()*31);
	x[2][0]=(int)(Math.random()*31);x[2][1]=(int)(Math.random()*31);x[2][2]=(int)(Math.random()*31);
	int[][] y = new int [3][3];
	y[0][0]=r;y[0][1]=r;y[0][2]=r;
	y[1][0]=r;y[1][1]=r;y[1][2]=r;
	y[2][0]=r;y[2][1]=r;y[2][2]=r;
	int[][] z = new int [3][3];
	
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
//			System.out.print(x[i][j]+" ");
			z[i][j]=x[i][j]+y[i][j];
			System.out.print(z[i][j]+" ");
		}
		System.out.println();
		}
		
	}
}


