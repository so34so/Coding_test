import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int idx;
		int time;
		public Node(int idx, int time) {
			super();
			this.idx = idx;
			this.time = time;
		}
		
	}
	static int N, M, count,time;
	static int[] check;
	static Queue<Node> q = new LinkedList<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	check = new int[100001];
    	
		bfs(N);
		System.out.println(time);
		System.out.println(count);
    }
    
    public static void bfs(int start) {
    	q.offer(new Node(start,0));
    	check[start] = 1;
    	while(!q.isEmpty()) {
    		Node temp = q.poll();
    		if(temp.idx==M) {
    			if(count==0) {
    				time=temp.time;
    			}
    			if(time==temp.time) {
    				count++;
    			}
    			continue;
    		}
    		int[] arr = {temp.idx-1,temp.idx+1,temp.idx*2};
    		for(int i=0;i<3;i++) {
    			int next = arr[i];
    			if(next<0 || next>100000)continue;
    			if(check[next]==0 || check[next]==temp.time+1) {
    				check[next] = temp.time+1;
    				q.offer(new Node(next,temp.time+1));
    			}
    		}
    	}
    }
}