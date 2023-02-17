import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
	static int[] num,arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[9];
		num = new int[7];
		
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		sum(0,0);
	}
	private static void sum(int cnt,int start){
		if(cnt==7) {
			int result = 0;
			for(int i=0;i<7;i++) {
				result+=num[i];
			}
			if(result==100) {
				for(int i=0;i<7;i++) {
					System.out.println(num[i]);
				}
				return;
			}
			return;
		}
		for(int i=start;i<9;i++) {
			num[cnt] = arr[i];
			sum(cnt+1,i+1);
		}
	}
}