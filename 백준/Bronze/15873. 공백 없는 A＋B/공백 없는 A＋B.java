import java.util.Scanner;

public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int b = 0;
		if(N==1010) {
			System.out.println(20);
		}else if(N%10==0){
			N/=100;
			System.out.println(N+10);
		}else {
			b += N%10;
			N/=10;
			if(N==10) {
				System.out.println(10+b);
			}else {
				System.out.println(N+b);
			}
		}
	}
}