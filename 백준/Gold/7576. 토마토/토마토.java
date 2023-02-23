import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class tomato{
	int x;
	int y;
	public tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int M, N;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<tomato> q;
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    		M = Integer.parseInt(st.nextToken());
    		N = Integer.parseInt(st.nextToken());
    		
    		map = new int[N][M];
    		q = new LinkedList<tomato>();
    		
    		for(int i=0;i<N;i++) {
    			st = new StringTokenizer(br.readLine());
    			for(int j=0;j<M;j++) {
    				map[i][j] = Integer.parseInt(st.nextToken());
    				if(map[i][j]==1) {
    					q.add(new tomato(i,j));
    				}
    			}
    		}
    		System.out.println(bfs());
    }
    
    public static int bfs() {
    	while(!q.isEmpty()) {
    		tomato t = q.poll();
    		int x = t.x;
    		int y = t.y;
    		
    		for(int i=0;i<4;i++) {
    			int nx = x+dx[i];
    			int ny = y+dy[i];
    			if(nx>=0&&ny>=0&&nx<N&&ny<M) {
    				if(map[nx][ny]==0) {
    					q.offer(new tomato(nx,ny));
    					map[nx][ny] = map[x][y] +1;
    				}
    			}
    		}
    	}
    	int result = Integer.MIN_VALUE;
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			if(map[i][j]==0) {
    				return -1;
    			}
    			result = Math.max(result, map[i][j]);
    		}
    	}
    	if(result==1)
    		return 0;
    	else
    		return result-1;
    }
}