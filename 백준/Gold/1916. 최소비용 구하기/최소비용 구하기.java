import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final int INF = Integer.MAX_VALUE;
	static List<ArrayList<Node>> list;
	static int dist[],N;
	static class Node implements Comparable<Node>{
		int nodeNum;
		int weight;
		public Node(int nodeNum, int weight) {
			this.nodeNum = nodeNum;
			this.weight = weight;
		}
		@Override
		public int compareTo(Node o) {
			return weight - o.weight;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		list = new ArrayList<>();
		dist = new int[N+1];
		Arrays.fill(dist, INF);
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list.get(s).add(new Node(d,w));
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int destination = Integer.parseInt(st.nextToken());
		
		System.out.println(dijkstra(start,destination));
		
	}
	static int dijkstra(int start, int destination) {
		
		PriorityQueue<Node> que = new PriorityQueue<>();
		boolean visit[] = new boolean[N+1];
		
		dist[start] = 0;
		que.offer(new Node(start,0));
		
		while(!que.isEmpty()) {
			Node queNode = que.poll();
			int start_nodeNum = queNode.nodeNum;
			
			if(!visit[start_nodeNum]) {
				visit[start_nodeNum] = true;
				for(Node node : list.get(start_nodeNum)) {
					if(!visit[node.nodeNum] && dist[node.nodeNum] >(dist[start_nodeNum] + node.weight)) {
						dist[node.nodeNum] = dist[start_nodeNum] + node.weight;
						que.offer(new Node(node.nodeNum,dist[node.nodeNum]));
					}
				}
			}
		}
		return dist[destination];
	}
}
