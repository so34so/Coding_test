import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int num1 = 0;
	static int num2 = 0;
	static int[] memo;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		memo = new int[N];
		fib(N);
		fibo(N);
		System.out.println(num1 + " " + num2);
		
	}
	public static int fib(int n) {
		if(n==1||n==2) {
			num1++;
			return 1;
		}else {
			return(fib(n-1) + fib(n-2));
		}
	}
	public static int fibo(int n) {
		memo[0] = 1;
		memo[1] = 1;
		for(int i=2;i<n;i++) {
			num2++;
			memo[i] = memo[i-2] + memo[i-1];
		}
		return memo[n-1];
	}
}