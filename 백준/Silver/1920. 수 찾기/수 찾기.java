import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int answer = 0;
            int start = 0;
            int end = N-1;
            int x = Integer.parseInt(st.nextToken());
            while(start<=end){
                int mid = (start+end)/2;
                if(arr[mid]==x){
                    answer = 1;
                    break;
                }else if(arr[mid]>=x){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}