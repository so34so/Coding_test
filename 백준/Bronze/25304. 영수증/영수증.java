import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] result = new int[N];
		int sum = 0;
		
		for(int i=0; i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int num = a*b;
			
			result[i] = num;
		}
		for(int i=0; i<N; i++) {
			sum += result[i];
		}
		if(X==sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}