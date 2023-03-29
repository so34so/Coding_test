import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int M,N,map[][],dp[][],h;
	private static int[] dx= {0,0,1,-1};
	private static int[] dy= {1,-1,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		dp = new int[M][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		dp[M-1][N-1] = 1;
		dfs(0,0);
		
		h = dp[0][0];
		System.out.println(h);
	}
	private static void dfs(int y, int x) {
		if (y == M - 1 && x == N - 1)	// 끝 지점 도착한 경우
			return;

		if (dp[y][x] != -1)				// 이미 끝 지점까지 탐색을 한 경우 (메모이제이션)
			return;

		dp[y][x] = 0;

		// 현재 지점 [y][x]에서 상하좌우 [ny][nx]로 가는 경로 개수 구하기
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if (!isValid(ny, nx))
				continue;

			// [y][x] -> [ny][nx] 내리막 길로 갈 수 있는 경우
			if (map[y][x] > map[ny][nx]) {
				if (dp[ny][nx] != -1)			// 이미 끝 지점까지 탐색을 한 경우 (메모이제이션)
					dp[y][x] += dp[ny][nx];
				else {							// 아직 끝 지점까지 탐색을 하지 않은 경우
					dfs(ny, nx);				// => 더 탐색
					dp[y][x] += dp[ny][nx];		// 끝 지점까지 탐색 완료 후, 갱신
				}
			}
		}
	}
	private static boolean isValid(int y, int x) {
		return(y>=0 && y<M)&&(x>=0&&x<N);
	}
}