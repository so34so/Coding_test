import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a+1];
        for(int i=2;i<=a;i++){
            arr[i] = i;
        }
        for(int i=2;i<=a;i++){
            if(arr[i] == 0) continue;
            for(int j=i;j<=a;j+=i){
                if(arr[j] != 0){
                    arr[j] = 0;
                    b--;
                    if(b==0){
                        System.out.print(j);
                        break;
                    }
                }
            }
        }

    }

}