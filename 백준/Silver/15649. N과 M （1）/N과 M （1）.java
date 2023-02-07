import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static boolean isSel[];
	static int temp[];
	static StringBuilder sb;
	public static void sol(int n) {
		if(n==M) {
			for(int i=0;i<M;i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			if(isSel[i]) continue;
			temp[n] = i+1;
			isSel[i] = true;
			sol(n+1);
			isSel[i] = false;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		temp = new int[M];
		isSel = new boolean[N];
		sb= new StringBuilder();
		sol(0);
		System.out.print(sb);
	}
}