import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		int b = a;
		
		while(true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			sum++;
			
			if(b == a) {
				break;
			}
		}
		System.out.println(sum);
	}
}