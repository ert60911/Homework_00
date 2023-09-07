package HW2;

import java.util.Random;
public class Practice13 {
public static int[][] generateRandomArray(int ro,int co,int Maxva) {
	int[][] array = new int [ro][co];
	Random random=new Random();
	
	for(int a=0;a<ro;a++) {
		for(int b=0;b<ro;b++) {
			array[a][b]= random.nextInt(Maxva);
		}
	}
	return array;
			
		}
		public static void printArray(int[][] array) {
			for(int[] a : array) {
				for(int num : a) {
					System.out.print(num+" ");
				}
				System.out.println();
	}
	
}
		public static int[][] addArrays(int[][] matrix1 , int[][]matrix2){
			int ro = matrix1.length;
			int co = matrix1.length;
			int[][] result =new int [ro][co];
			
			for(int a=0;a<ro;a++) {
				for(int b=0;b<co;b++) {
					result[a][b] =matrix1[a][b]+matrix2[a][b];
					
				}
			}
			return result;
		}
		public static void main(String[] args) {
			int[][] x = generateRandomArray(3,3,29);
			int[][] y = generateRandomArray(3,3,29);
			int[][]z= addArrays(x,y);
			System.out.println("array x:");
			printArray(x);
			System.out.println("array y:");
			printArray(y);
			System.out.println("array z");
			printArray(z);
		}
}

