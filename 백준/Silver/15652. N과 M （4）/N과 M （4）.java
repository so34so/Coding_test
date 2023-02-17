import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int temp[];
	static boolean check[];
	static StringBuilder sb;
	public static void sol(int n,int start) {
		if(n==M) {
			for(int i=0;i<M;i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=start;i<N;i++) {
			temp[n] = i+1;
			check[i] = true;
			sol(n+1,i);
			check[i] = false;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		temp = new int[M];
		sb= new StringBuilder();
		check = new boolean[N];
		sol(0,0);
		System.out.print(sb);
	}
}