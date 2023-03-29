import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int N, W[][];
	private static boolean check[];
	private static int answer = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		W = new int[N+1][N+1];
		check = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=1;i<=N;i++) {
			check[i] = true;
			dfs(i,i,0,0);
			check[i] = false;
		}
		System.out.println(answer);
	}
	private static void dfs(int start,int now, int sum, int cnt) {
		if(cnt==N-1) {
			if(W[now][start]!=0) {
				sum += W[now][start];
				if(sum<answer) answer = sum;
			}
			return;
		}
		
		for(int i=1;i<=N;i++) {
			if(check[i]==false&&W[now][i]!=0) {
				check[i]=true;
				dfs(start,i,sum+W[now][i],cnt+1);
				check[i]=false;
			}
		}
	}
}