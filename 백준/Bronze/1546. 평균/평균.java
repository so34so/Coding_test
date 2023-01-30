import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] M = new int[N];
		int max = 0;
		double Nnum = 0;
		
		for(int i=0; i<N; i++) {
			M[i] = sc.nextInt();
			if(max<M[i]) max = M[i];
		}
		
		for(int i=0; i<N; i++) {
				Nnum += (double)M[i]/max*100;
		}
		double result = Nnum/N;
		System.out.println(result);
	}
}