import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] num,input;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		input=new int[N];
		num=new int[M];
		
		for(int i=0;i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		
		sb = new StringBuilder();
		Arrays.sort(input);
		sol(0,0);
		System.out.println(sb);
	}
	private static void sol(int n, int x) {
		if(n==M) {
			for(int i=0;i<M;i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=x;i<N;i++) {
				num[n]=input[i];
				sol(n+1,i);
		}
	}
}