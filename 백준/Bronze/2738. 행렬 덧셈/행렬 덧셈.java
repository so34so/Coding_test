import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[][] arr1 = new int[A][B];
		int[][] arr2 = new int[A][B];
		for(int i=0; i<A;i++) {
			for(int j=0; j<B;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<A;i++) {
			for(int j=0; j<B;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<A;i++) {
			for(int j=0; j<B;j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
				if(j==B-1)System.out.println();
			}
		}
	}
}