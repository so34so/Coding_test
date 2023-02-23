import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int R, C,ans;
	static boolean check[];
	static int[][] map;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	R = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	
    	map = new int[R][C];
    	check = new boolean[26];
    	
    	for(int i=0;i<R;i++) {
    		String str = br.readLine();
    		for(int j=0;j<C;j++) {
    			map[i][j] = str.charAt(j)-'A';
    		}
    	}
    	
    	dfs(0,0,0);
    	System.out.println(ans);
    }
    
    public static void dfs(int x,int y,int count) {
    	if(check[map[x][y]]) {
    		ans = Math.max(ans, count);
    		return;
    	}else {
    		check[map[x][y]] = true;
    		for(int i=0;i<4;i++) {
    			int nx = x +dx[i];
    			int ny = y +dy[i];
    			if(nx>=0 && ny>=0 && nx<R && ny <C) {
    				dfs(nx,ny,count+1);
    			}
    		}
    		check[map[x][y]] = false;
    	}
    }
}