import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(sol(Integer.parseInt(br.readLine())));
	}
	public static int sol(int n) {
		int cnt =0;
		if(n<100) {
			return n;
		}else {
			cnt=99;
			for(int i=100;i<=n;i++) {
				int back = i/100;
				int sib = (i%100)/10;
				int ill = (i%10);
				if((back-sib) == (sib-ill)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}