import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N,M,temp[],num[];
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		temp = new int[M];
		check = new boolean[N];
		num = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		sol(0);
		System.out.println(sb);
	}
	private static void sol(int n) {
		if(n==M) {
			for(int i=0;i<M;i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}else {
			int before = 0;
			for(int i=0;i<N;i++) {
				if(check[i]) continue;
				else if(before != num[i]) {
					check[i] = true;
					temp[n] = num[i];
					before = num[i];
					sol(n+1);
					check[i] = false;
				}
			}
		}
	}
}