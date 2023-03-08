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
	static int N, M, count;
	static boolean[] check;
	static int time = Integer.MAX_VALUE;
	static Queue<Node> q = new LinkedList<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	check = new boolean[100001];
    	
    	if(N==M) {
    		System.out.println(0);
    	}else {
    		bfs(N);
    	}
    }
    
    public static void bfs(int start) {
    	q.offer(new Node(start,0));
    	check[start] = true;
    	while(!q.isEmpty()) {
    		Node temp = q.poll();
    		if(temp.idx == M) {
    			time = Math.min(time, temp.time);
    			System.out.println(time);
    			return;
    		}
    		int next;
    		next = temp.idx*2;
    		if(next<100001 && !check[next]) {
    			check[next] = true;
    			q.offer(new Node(next,temp.time));
    		}
    		next = temp.idx-1;
    		if(next>=0 && !check[next]) {
    			check[next] = true;
    			q.offer(new Node(next,temp.time+1));
    		}
    		next = temp.idx+1;
    		if(next<100001 && !check[next]) {
    			check[next] = true;
    			q.offer(new Node(next,temp.time+1));
    		}
    	}
    }
}