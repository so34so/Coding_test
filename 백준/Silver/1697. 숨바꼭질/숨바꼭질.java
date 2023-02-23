import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, count, min,check[];
	static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	check = new int[100001];
    	
    	if(N==M) {
    		System.out.println(0);
    	}else {
    		bfs(N);
    	}
    }
    
    public static void bfs(int start) {
    	q.offer(start);
    	check[start] = 1;
    	while(!q.isEmpty()) {
    		int temp = q.poll();
    		for(int i=0;i<3;i++) {
    			int next;
    			if(i==0) {
    				next = temp+1;
    			}else if(i==1) {
    				next = temp-1;
    			}else {
    				next = temp *2;
    			}
    			
    			if(next == M) {
    				System.out.println(check[temp]);
    				return;
    			}
    			if(next >=0 && next < check.length && check[next]==0) {
    				q.offer(next);
    				check[next] = check[temp] +1;
    			}
    		}
    	}
    }
}