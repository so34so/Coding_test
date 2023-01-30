import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		
		for(int i=0;i<N;i++) {
			if(min>a[i]) min = a[i];
			if(max<a[i]) max = a[i];
		}
		
		System.out.println(min + " " + max);
	}
}