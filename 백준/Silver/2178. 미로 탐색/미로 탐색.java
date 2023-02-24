import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
class miro{
	int x;
	int y;
	public miro(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int N,M,map[][];
	static boolean check[][];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	map = new int[N][M];
    	check = new boolean[N][M];
    	
    	for(int i=0;i<N;i++) {
    		String str = br.readLine();
    		for(int j=0;j<M;j++) {
    			map[i][j] = str.charAt(j)-'0';
    		}
    	}
    	check[0][0] = true;
    	bfs(0,0);
    	System.out.println(map[N-1][M-1]);
    	
    }
    public static void bfs(int x, int y) {
    	Queue<miro> q = new LinkedList<>();
    	q.offer(new miro(x,y));
    	
    	while(!q.isEmpty()) {
    		int realx = q.peek().x;
    		int realy = q.peek().y;
    		q.poll();
    		for(int i=0;i<4;i++) {
    			int nx = realx + dx[i];
    			int ny = realy + dy[i];
    			if(nx>=0 && ny>=0 && nx<N && ny<M) {
    				if(map[nx][ny]==1 && !check[nx][ny]) {
    					q.offer(new miro(nx,ny));
    					map[nx][ny] = map[realx][realy] +1;
    					check[nx][ny] = true;
    				}
    			}
    		}
    	}
    	
    }
}