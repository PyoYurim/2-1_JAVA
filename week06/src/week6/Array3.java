package week6;

public class Array3 {
	public static void main(String[] args) {
		int i, j =0;
		float[] avg = new float[5];
		int[] sum = new int[5];
		int[][] score = {{49, 80, 20, 100, 80}, {43, 60, 85, 30, 90}, {49, 82, 48, 50, 100}};	
		for(j = 0; j < 5; j++) {
			for(i = 0; i < 3; i++) {
				sum[j] += score[i][j];
			}
			avg[j] = (float)(sum[j] / 3.0); 
		}
		char[] stu = {'A', 'B', 'C', 'D', 'E'};
		for (int s = 0; s < 5; s++ ) {
			System.out.println(stu[s] + " ÇÐ»ý ÃÑÁ¡ : " + sum[s] +"Á¡, Æò±Õ : " + avg[s] + "Á¡" );
		}
	}
}
