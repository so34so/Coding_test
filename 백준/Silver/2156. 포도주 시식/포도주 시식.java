import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int n ,arr[];
	private static Integer dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		dp = new Integer[n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		if(n>1) {
			dp[2] = arr[1]+arr[2];
		}
		System.out.println(recur(n));
	}
	private static int recur(int n) {
		if(dp[n]==null) {
			dp[n] = Math.max(Math.max(recur(n-2),recur(n-3)+arr[n-1])+arr[n], recur(n-1));
		}
		return dp[n];
	}
}