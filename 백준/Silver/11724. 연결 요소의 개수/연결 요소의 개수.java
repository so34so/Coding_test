import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, arr[][], count;
	static boolean check[];
	static Queue<Integer> q = new LinkedList<Integer>();
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	arr = new int[N+1][N+1];
    	check = new boolean[N+1];
    	for(int i=0;i<M;i++) {
    		st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[b][a] = arr[a][b] = 1;
    	}
    	count = 0;
    	for(int i=1;i<N+1;i++) {
    		if(!check[i]) {
    			dfs(i);
    			count++;
    		}
    	}
    	System.out.println(count);
    }
    
    public static void dfs(int start) {
    	check[start] = true;
    	for(int i=1;i<=N;i++) {
    		if(arr[start][i] == 1 && !check[i]) {
    			dfs(i);
    		}
    	}
    }
    
/*    public static void bfs(int start) {
    	q.offer(start);
    	while(!q.isEmpty()) {
    		start = q.poll();
    		check[start] = true;
    		for(int i=0;i<N;i++) {
    			if(arr[start][i] == 1 && !check[i]) {
    				q.offer(i);
    				check[i] = true;
    				count++;
    			}
    		}
    	}
    }*/
}