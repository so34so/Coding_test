import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class point {
		int x;
		int y;
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static int N,M,map[][];
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};
	public static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		search(0);
		
		System.out.println(max);
	}
	
	private static void search(int wallCnt) {
		if(wallCnt==3) {
			bfs();
			return;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					search(wallCnt+1);
					map[i][j] = 0;
				}
			}
		}
	}
	private static void bfs() {
		Queue<point> q = new ArrayDeque<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++	) {
				if(map[i][j]==2) {
					q.add(new point(i,j));
				}
			}
		}
		int[][] copyMap = new int[N][M];
		
		for(int i=0;i<N;i++	) {
			copyMap[i] = map[i].clone();
		}
		
		while(!q.isEmpty()) {
			point now = q.poll();
			int x = now.x;
			int y = now.y;
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=0 && ny>=0 && nx<N && ny<M) {
					if(copyMap[nx][ny]==0) {
						q.add(new point(nx,ny));
						copyMap[nx][ny]=2;
					}
				}
			}
		}
		safezone(copyMap);
	}
	private static void safezone(int[][] copyMap) {
		int safezone = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(copyMap[i][j] == 0) {
					safezone++;
				}
			}
		}
		if(max <safezone) {
			max = safezone;
		}
	}
}