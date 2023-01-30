import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int money = 0;
		int max = 0;
		
		if(a==b && b==c) {
			money = 10000+(a*1000);
			System.out.println(money);
		}
		else if(a==b || a==c || b==c) {
			if(a==b || a==c) {
				money = 1000+(a*100);
				System.out.println(money);
			}
			else if(b==c) {
				money = 1000+(b*100);
				System.out.println(money);
			}
		}
		else {
			if(a>b) {
				if(c>a) {
					max = c;
				}
				else {
					max = a;
				}
			}
			else {
				if(c>b) {
					max = c;
				}
				else {
					max = b;
				}
			}
			System.out.println(max*100);
		}
	}
}