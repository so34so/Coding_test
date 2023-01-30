import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int m1 = m-45;
		if(m1<0) {
			m1 += 60;
			h -= 1;
		}
		if(h<0) {
			h += 24;
		}
		
		System.out.println(h + " " + m1);
	}
}