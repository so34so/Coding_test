
import java.util.Scanner;

//재귀호출을 이용한 피보나치 수 구하기
public class Main {
	public static int fibo(int n) {
		if(n<2) return n;
		else return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}
}
