import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		while(st.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer num = new StringTokenizer(st.nextToken(),"+");
			while(num.hasMoreTokens()) {
				temp += Integer.parseInt(num.nextToken());
			}
			if(sum==Integer.MAX_VALUE) {
				sum = temp;
			}else {
				sum-= temp;
			}
		}
		System.out.println(sum);
	}
}