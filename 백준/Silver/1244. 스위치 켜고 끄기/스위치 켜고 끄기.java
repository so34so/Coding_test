import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int [N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=1;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int S = Integer.parseInt(br.readLine());
		for(int i=0;i<S;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int gender = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			if(gender==1) {
				man(number);
			}else if(gender==2) {
				women(number);
			}
		}
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}
	private static void man(int n) {
		for(int j=n;j<=N;j+=n) {
			if(arr[j]==1) {
				arr[j] = 0;
			}else {
				arr[j] = 1;
			}
		}
	}
	private static void women(int n) {
		if(arr[n]==0) {
			arr[n]=1;
		}else {
			arr[n]=0;
		}
		int count =1;
		while((n-count)>0 && (n+count)<arr.length) {
			if(arr[n+count] == arr[n-count]) {
				if(arr[n+count]==0) {
					arr[n+count]=1;
					arr[n-count]=1;
				}else if(arr[n+count]==1) {
					arr[n+count]=0;
					arr[n-count]=0;
				}count++;
			}else {
				break;
			}
		}
	}
}