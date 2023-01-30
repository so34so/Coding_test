import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[9];
		int max = 0; int num=0;
		
		for(int i=0;i<9;i++) {
			N[i] = sc.nextInt();
			if(N[i]>max) {
				max = N[i];
			}
		}
		for(int i=0;i<9;i++) {
			if(max == N[i]) num =i+1;
		}
		System.out.println(max);
		System.out.println(num);
	}
}