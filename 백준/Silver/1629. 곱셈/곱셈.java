import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long A,B,C;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
		
		System.out.println(ab(A,B));
		
	}
	public static long ab(long a, long b) {
		if(b==1) return A%C;
		long temp = ab(A, b/2);
		
		if(b%2==1) {
			return (temp*temp%C)*a%C;
		}
		return temp*temp%C;
	}
}