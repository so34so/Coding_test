import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static StringBuilder sb;
	static int[] numbers,input;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sb = new StringBuilder();
		numbers =new int[M];
		sol(0,1);
		System.out.println(sb);
	}
	private static void sol(int n,int start) {
		if(n==M) {
			for(int i=0;i<M;i++) {
				sb.append(numbers[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=start;i<=N;++i) {
			numbers[n]=i;
			sol(n+1,i+1);
		}
	}
}