import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N,M,map[][];
	static boolean check[][];
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		check = new boolean[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				check[i][j] = true;
				dfs(i,j,map[i][j],1);
				check[i][j] = false;
			}
		}
		System.out.println(max);
	}
	private static void dfs(int x, int y, int sum,int cnt) {
		if(cnt==4) {
			max = Math.max(max, sum);
			return;
		}
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<M) {
				if(!check[nx][ny]) {
					if(cnt==2) {
						check[nx][ny] = true;
						dfs(x,y,sum+map[nx][ny],cnt+1);
						check[nx][ny] = false;
					}
					check[nx][ny] = true;
					dfs(nx,ny,sum+map[nx][ny],cnt+1);
					check[nx][ny] = false;
				}
			}
		}
	}
}