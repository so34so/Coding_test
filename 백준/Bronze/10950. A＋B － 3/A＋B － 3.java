import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] num = new int[T];
		
		for(int i=0; i<T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			num[i] = a+b;
		}
		for(int i=0; i<T;i++) {
			System.out.println(num[i]);
		}
		
	}
}