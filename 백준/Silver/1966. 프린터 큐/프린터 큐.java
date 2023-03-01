import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc<T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0;
			Queue<int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				int a = Integer.parseInt(st.nextToken());
				q.offer(new int[] {i,a});
			}
			
			while(true) {
				int now[] = q.poll();
				boolean flag = true;
				
				for(int que[]:q) {
					if(que[1]>now[1]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					cnt++;
					if(now[0]==M)break;
				}else {
					q.offer(now);
				}
			}
			System.out.println(cnt);
		}
		
	}
}