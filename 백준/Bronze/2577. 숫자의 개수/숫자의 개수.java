import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String str = String.valueOf(A*B*C);
		
		int[] arr =new int[str.length()];
		int[] num = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i)-'0';
			num[arr[i]] += 1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}