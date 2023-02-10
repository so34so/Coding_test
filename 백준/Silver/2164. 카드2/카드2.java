import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		Queue<Integer> queue = new LinkedList<>();
		int p;
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		while(queue.size()!=1) {
			p = queue.poll();
			if(cnt%2==0) {
				cnt++;
			}else if(cnt%2!=0) {
				queue.offer(p);
				cnt++;
			}
		}
		System.out.println(queue.poll());
	}
}