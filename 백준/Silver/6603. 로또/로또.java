import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static int N;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			if(N==0)break;
			
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			check = new boolean[N];
			dfs(0,0);
			System.out.println();
		};
		
	}
	private static void dfs(int cnt,int start) {
		if(cnt==6) {
			for(int i=0;i<N;i++) {
				if(check[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		for(int i=start;i<N;i++) {
			check[i] = true;
			dfs(cnt+1,i+1);
			check[i] = false;
		}
	}
}