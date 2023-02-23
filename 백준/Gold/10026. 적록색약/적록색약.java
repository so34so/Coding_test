import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] dx = new int[] {0,0,-1,1};
	static int[] dy = new int[] {1,-1,0,0};
	static int N;
	static char[][] map;
	static boolean[][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N+1][N+1];
        check = new boolean[N+1][N+1];
        for(int i=0;i<N;i++) {
        	String str = br.readLine();
        	for(int j=0;j<N;j++) {
        		map[i][j] = str.charAt(j);
        	}
        }
        int cnt = 0;
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		if(!check[i][j]) {
        			dfs(i,j);
        			cnt++;
        		}
        	}
        }
        int normal = cnt;
        cnt = 0;
        check = new boolean[N+1][N+1];
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		if(map[i][j]=='G') {
        			map[i][j]='R';
        		}
        	}
        }
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		if(!check[i][j]) {
        			dfs(i,j);
        			cnt++;
        		}
        	}
        }
        int notnormal = cnt;
        System.out.println(normal + " " + notnormal);
    }
    public static void dfs(int x, int y) {
    	check[x][y]=true;
    	char chr = map[x][y];
    	for(int i=0;i<4;i++) {
    		int nx = x+dx[i];
    		int ny = y+dy[i];
    		if(nx>=0 && ny>=0 && nx<N && ny<N) {
    			if(!check[nx][ny] && map[nx][ny]==chr) {
    				dfs(nx,ny);
    			}
    		}
    	}
    }
}