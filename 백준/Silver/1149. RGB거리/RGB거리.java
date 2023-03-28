import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int cost[][],dp[][];
	private static int red =0;
	private static int green =1;
	private static int blue =2;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		cost = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cost[i][red] = Integer.parseInt(st.nextToken()); 
			cost[i][green] = Integer.parseInt(st.nextToken()); 
			cost[i][blue] = Integer.parseInt(st.nextToken()); 
		}
		
		dp[0][red] = cost[0][red];
		dp[0][green] = cost[0][green];
		dp[0][blue] = cost[0][blue];
		
		System.out.println(Math.min(paint(N-1,red), Math.min(paint(N-1,green), paint(N-1,blue))));
	}
	
	public static int paint(int n, int color) {
		if(dp[n][color]==0) {
			if(color==red) {
				dp[n][red] = Math.min(paint(n-1,green), paint(n-1,blue))+cost[n][red];
			}
			else if(color==green) {
				dp[n][green] = Math.min(paint(n-1,red), paint(n-1,blue))+cost[n][green];
			}
			else if(color==blue) {
				dp[n][blue] = Math.min(paint(n-1,red), paint(n-1,green))+cost[n][blue];
			}
		}
		return dp[n][color];
	}
}
