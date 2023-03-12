import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long map[] = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			map[i] = Long.parseLong(st.nextToken());
		}
		
		int left = 0;
		int right = N-1;
		int m1 = 0;
		int m2 = 0;
		long min = Long.MAX_VALUE;
		while(left<right) {
			long sum = map[left]+map[right];
			if(min > Math.abs(sum)) {
				min = Math.abs(sum);
				m1 = left;
				m2 = right;
			}
			if(sum>=0) {
				right--;
			}else {
				left++;
			}
		}
		
		System.out.println(map[m1] + " " + map[m2]);
		
	}
}