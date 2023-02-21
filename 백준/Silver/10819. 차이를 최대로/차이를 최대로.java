import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static int arr[],N,temp,isSel[];
	static boolean check[];
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		isSel = new int[N];
		check = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		ab(0);
		System.out.println(temp);
	}
	public static void ab(int a) {
		if(a==N) {
			int sum=0;
			for(int i=0;i<N-1;i++) {
				sum+=Math.abs(isSel[i] - isSel[i+1]);
			}
			temp = Math.max(temp, sum);
			return;
		}
		for(int i=0;i<N;i++) {
			if(!check[i]) {
				check[i] = true;
				isSel[a] = arr[i];
				ab(a+1);
				check[i] = false;
			}
		}
	}
}