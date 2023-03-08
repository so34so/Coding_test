import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Point{
		int x;
		int y;
		int breakwall;
		int count;
		public Point(int x, int y, int breakwall, int count) {
			super();
			this.x = x;
			this.y = y;
			this.breakwall = breakwall;
			this.count = count;
		}
	}
    static int N,M,map[][];
    static Queue<Point> q = new ArrayDeque<>();
    static boolean check[][][];
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	check = new boolean[N][M][2];
    	map = new int[N][M];
    	for(int i=0;i<N;i++) {
    		String str = br.readLine();
    		for(int j=0;j<M;j++) {
    			map[i][j] = str.charAt(j)-'0';
    		}
    	}
    	
    	bfs(0,0);
    	
    }
	private static void bfs(int x, int y) {
		q.offer(new Point(x,y,0,1));
		check[x][y][0] = true;
		check[x][y][1] = true;
		
		while(!q.isEmpty()) {
			Point temp = q.poll();
			if(temp.x==N-1 && temp.y==M-1) {
				System.out.println(temp.count);
				return;
			}
			for(int i=0;i<4;i++) {
				int nx = temp.x+dx[i];
				int ny = temp.y+dy[i];
				int breakwall = temp.breakwall;
				int count = temp.count;
				
				if(nx>=0 && ny>=0 && nx<N && ny<M &&map[nx][ny]==1) {
					if(breakwall == 0 && !check[nx][ny][1]) {
						check[nx][ny][1] = true;
						q.offer(new Point(nx,ny,1,count+1));
					}
				}else if(nx>=0 && ny>=0 && nx<N && ny<M &&map[nx][ny]==0) {
					if(!check[nx][ny][breakwall]) {
						q.offer(new Point(nx,ny,breakwall,count+1));
						check[nx][ny][breakwall]=true;
					}
				}
			}
		}
		System.out.println(-1);
	}
}