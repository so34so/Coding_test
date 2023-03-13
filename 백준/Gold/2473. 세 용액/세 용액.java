import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		Arrays.sort(map);
		long[] res = new long[3];
		long min = Long.MAX_VALUE;
		for(int i=0;i<N;i++) {
			int left = i+1;
			int right = N-1;
			while(left<right) {
				long sum = map[left]+map[right]+map[i];
				if(min > Math.abs(sum)) {
					min = Math.abs(sum);
					res[0] = map[i];
					res[1] = map[left];
					res[2] = map[right];
				}
				if(sum>=0) {
					right--;
				}else {
					left++;
				}
			}
		}
		System.out.println(res[0] + " " + res[1] + " " + res[2]);
		
	}
}