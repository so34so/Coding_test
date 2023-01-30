import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr;
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			arr = new int[A];
			double sum = 0;
			
			for(int j=0; j<A; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double mean = (sum/A);
			double count = 0;
			
			for(int j=0; j<A; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/A)*100);
		}
	}
}