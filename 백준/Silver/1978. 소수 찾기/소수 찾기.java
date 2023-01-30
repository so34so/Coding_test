import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i=0; i<N;i ++) {
			boolean in = true;
			int num = sc.nextInt();
			if(num==1) {
				continue;
			}
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					in = false;
					break;
				}
			}
			if(in) {
				count++;
			}
		}
		System.out.println(count);
	}
}