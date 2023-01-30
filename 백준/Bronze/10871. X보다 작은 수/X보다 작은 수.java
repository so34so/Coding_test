import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] X = new int[N];
		
		for(int i=0; i<N; i++) {
			X[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(X[i]<A) System.out.print(X[i] + " ");
		}
	}
}