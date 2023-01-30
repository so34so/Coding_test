import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[31];
		
		for(int i=1;i<29;i++) {
			int M = sc.nextInt();
			X[M] = 1;
		}
		
		for(int i=1;i<X.length;i++) {
			if(X[i]!=1) {
				System.out.println(i);
			}
		}
		
	}
}