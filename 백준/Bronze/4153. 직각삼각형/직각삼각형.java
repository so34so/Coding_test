import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		int C = Integer.parseInt(st.nextToken());
    		if(A==0 && B==0 && C==0) break;
    		
    		int A2 = A*A;
    		int B2 = B*B;
    		int C2 = C*C;
    		
    		if(A2==(B2+C2) || B2==(A2+C2) || C2==(A2+B2)) {
    			System.out.println("right");
    		}else {
    			System.out.println("wrong");
    		}
    		
    	}
    	
    }
}