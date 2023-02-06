import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[8];
		int cnt=0;
		int max =8;
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(arr[0]==1) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==i+1) {
					cnt++;
				}
			}
			if(cnt==7) {
				System.out.println("ascending");
			}else {
				System.out.println("mixed");
			}
		}
		else if(arr[0]==8) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==max) {
					cnt++; max--;
				}
			}
			if(cnt==7) {
				System.out.println("descending");
			}else {
				System.out.println("mixed");
			}
		}else {
			System.out.println("mixed");
		}
	}
}