import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N,arr[],res;
	static List<ArrayList<Integer>> list;
	static boolean selected[],visited[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		res = Integer.MAX_VALUE;
		arr = new int[N];
		selected = new boolean[N];
		list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			for(int j=0;j<cnt;j++) {
				int b = Integer.parseInt(st.nextToken());
				list.get(i).add(b-1);
			}
		}
		
		divide(0);
		if(res == Integer.MAX_VALUE) {
			res = -1;
		}
		System.out.println(res);
		
	}
	private static void divide(int idx) {
		if(idx==N) {
			List<Integer> aList = new ArrayList<>();
			List<Integer> bList = new ArrayList<>();
			
			for(int i=0;i<N;i++) {
				if(selected[i]) {
					aList.add(i);
				}else {
					bList.add(i);
				}
			}
			
			if(aList.size()==0 || bList.size()==0)return;
			if(check(aList) && check(bList)) {
				getPeopleDiff();
			}
			return;
		}
		selected[idx] = true;
		divide(idx+1);
		selected[idx] = false;
		divide(idx+1);
	}
	private static boolean check(List<Integer> a) {
		Queue<Integer> q = new LinkedList<>();
		visited = new boolean[N];
		visited[a.get(0)] = true;
		q.offer(a.get(0));
		
		int count = 1;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i=0;i<list.get(cur).size();i++) {
				int y = list.get(cur).get(i);
				if(a.contains(y) && !visited[y]) {
					q.offer(y);
					visited[y] = true;
					count++;
				}
			}
		}
		if(count==a.size())return true;
		else return false;
	}
	private static void getPeopleDiff() {
		int PA = 0, PB = 0;
		for(int i=0;i<N;i++) {
			if(selected[i]) {
				PA += arr[i];
			}else {
				PB += arr[i];
			}
		}
		int diff = Math.abs(PA-PB);
		res = Math.min(res, diff);
	}
}