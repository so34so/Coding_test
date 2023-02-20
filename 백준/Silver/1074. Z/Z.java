
import java.util.Scanner;
public class Main {
	static int N,r,c,size,cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		size = (int)Math.pow(2, N);
		cnt = 0;
		cut(r,c,size);
		System.out.println(cnt);
	}
	
	static void cut(int r, int c, int size) {
		if(size==1) return;
		int half = size/2;
		
		if(r<half && c<half) {	//1사분면
			cut(r,c,half);
		}else if(r<half && c>=half) {//2사분면
			cnt += size*size/4;
			cut(r,c-half,half);
		}else if(r>=half && c<half) {//3사분면
			cnt += (size*size/4)*2;
			cut(r-half,c,half);
		}else {						//4사분면
			cnt += (size*size/4)*3;
			cut(r-half,c-half,half);
		}
		
	}
}