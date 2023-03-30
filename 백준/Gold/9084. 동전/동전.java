import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] sent = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				sent[i] = Integer.parseInt(st.nextToken());
			}
			int money = Integer.parseInt(br.readLine());
			int[] dp = new int[money+1];
			dp[0] = 1;
			for(int coin : sent) {
				for(int j=coin;j<=money;j++) {
					dp[j] += dp[j-coin];
				}
			}
			System.out.println(dp[money]);
		}
	}
}