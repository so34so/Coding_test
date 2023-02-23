import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int T,M,N,K,count;
	static int[][] arr;
	static boolean[][] check;
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	T = Integer.parseInt(br.readLine());
    	
    	for(int tc =0;tc<T;tc++) {
    		count=0;
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		M = Integer.parseInt(st.nextToken());
    		N = Integer.parseInt(st.nextToken());
    		K = Integer.parseInt(st.nextToken());
    		check = new boolean[M][N];
    		arr = new int[M][N];
    		for(int i=0;i<K;i++) {
    			st = new StringTokenizer(br.readLine());
    			int a = Integer.parseInt(st.nextToken());
    			int b = Integer.parseInt(st.nextToken());
    			
    			arr[a][b] = 1;
    		}
    		for(int j=0;j<M;j++) {
    			for(int k=0;k<N;k++) {
    				if(arr[j][k]==1 && !check[j][k]) {
    					count++;
    					dfs(j,k);
    				}
    			}
    		}
    		System.out.println(count);
    	}
    	
    }
    public static void dfs(int x,int y) {
        check[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < M && ny < N){
                if(arr[nx][ny] == 1 && !check[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}