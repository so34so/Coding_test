import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int exh = c/60;
		int exm = c%60;
		
		int h = a + exh;
		int m = b + exm;
		
		if(m>=60) {
			m -= 60;
			h += 1;
		}
		
		if(h>=24) {
			h -= 24;
		}
		System.out.println(h + " " + m);
	}
}