import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String Str = br.readLine();
		long a = 0;
		long pow = 1;
		for(int i=0;i<L;i++) {
			a +=((Str.charAt(i)-96)*pow);
			pow = (pow*31)%1234567891;
		}
		System.out.println(a % 1234567891);
	}
}