package aplication;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int z = sc.nextInt();
		int [][]mat = new int[n][z];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; i < mat[i].length; i++) {
				mat[i][j] = sc.nextInt();
			}					
		}	
		
		
		int x = sc.nextInt();
		
		
		
		sc.close();
	}

}
