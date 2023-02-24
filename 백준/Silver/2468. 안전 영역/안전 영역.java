import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int N,count;
    private static boolean[][] visited;
    private static int[][] map, realmap; 

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.parseInt(br.readLine());
    	map = new int[N][N];
    	realmap = new int[N][N];
    	for(int a=0;a<N;a++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int b=0;b<N;b++) {
    			map[a][b] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	int max = 1;
    	for(int i=1;i<101;i++) {
    		count=0;
    		visited = new boolean[N][N];
    		for(int a=0;a<N;a++) {
    			for(int b=0;b<N;b++) {
    				if(map[a][b]<=i) {
    					realmap[a][b] = 0;
    				}else {
    					realmap[a][b] = 1;
    				}
    			}
    		}
    		for(int j=0;j<N;j++) {
    			for(int k=0;k<N;k++) {
    				if(realmap[j][k]==1 && !visited[j][k]) {
    					dfs(j,k);
    					count++;
    				}
    			}
    		}
    		max = Math.max(max, count);
    	}
    	System.out.println(max);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < N && ny < N){
                if(realmap[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}