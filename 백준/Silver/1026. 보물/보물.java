import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N,arr[],brr[],temp;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		brr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			brr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		Arrays.sort(brr);
	
		for(int i=0;i<N;i++) {
			temp+=arr[i]*brr[N-1-i];
		}
		System.out.println(temp);
		
	}
}