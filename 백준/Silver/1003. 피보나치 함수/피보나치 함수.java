import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int zero;
	static int one;
	static int zeroplus;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			fibo(N);
			sb.append(zero).append(" ").append(one).append("\n");
		}
		System.out.println(sb);
	}
	public static void fibo(int N) {
		zero =1;
		one =0;
		zeroplus=1;
		for(int i=0;i<N;i++) {
			zero = one;
			one = zeroplus;
			zeroplus = zero + one;
		}
	}
}