import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		
		System.out.print("<");
		while(queue.size() != 1) {
			for(int i=1;i<K;i++) {
				queue.offer(queue.poll());
			}
			System.out.print(queue.poll() + ", ");
		}
		System.out.print(queue.poll() + ">");
	}
}