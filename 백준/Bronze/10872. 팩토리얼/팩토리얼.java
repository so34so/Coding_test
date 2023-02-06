import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int factorial3(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*factorial3(n-1);
		}
	}
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int line=Integer.parseInt(br.readLine());
			System.out.println(factorial3(line));
	}
}