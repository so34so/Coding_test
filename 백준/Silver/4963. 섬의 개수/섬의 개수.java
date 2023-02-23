import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static int dx[] = {0,0,1,-1,-1,1,-1,1};
    private static int dy[] = {1,-1,0,0,-1,1,1,-1};
    private static int w,h,count;
    private static boolean[][] visited;
    private static int[][] map; 

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	w = Integer.parseInt(st.nextToken());
        	h = Integer.parseInt(st.nextToken());
        	
        	if(h==0 && w==0) break;
        	map = new int[h][w];
        	visited = new boolean[h][w];
        	
        	for(int i=0; i<h; i++){
        		st = new StringTokenizer(br.readLine());
        		for(int j=0; j<w; j++){
        			map[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	count = 0;
        	for(int i=0; i<h; i++){
        		for(int j=0; j<w; j++){
        			if(map[i][j] == 1 && !visited[i][j]){
        				dfs(i,j);
        				count++;
        			}
        		}
        	}
        	System.out.println(count);
        }

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < h && ny < w){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}