package HW4;

public class HW6 {
	public static void main(String[] args) {
		int[][] x = {{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,90,75,90,89,90},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}};
		int[] count=new int [8];
	
		
		for(int i=0;i<x.length;i++) {
			int bestscore=0,student=0;
			for(int j=0;j<x[i].length;j++) {
				if(bestscore<x[i][j]) {
					bestscore=x[i][j];
					student=j;
				}
			}
			count[student]+=1;
		}
		System.out.println("一號同學最高分的次數為"+count[0]);
		System.out.println("二號同學最高分的次數為"+count[1]);
		System.out.println("三號同學最高分的次數為"+count[2]);
		System.out.println("四號同學最高分的次數為"+count[3]);
		System.out.println("五號同學最高分的次數為"+count[4]);
		System.out.println("六號同學最高分的次數為"+count[5]);
		System.out.println("七號同學最高分的次數為"+count[6]);
		System.out.println("八號同學最高分的次數為"+count[7]);			
		}
	}
