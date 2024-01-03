import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        for(int i=1;i<=n;i++){
            que.offer(i);
        }
        
        while(que.size()!=1){
            for(int i=1;i<m;i++){
                que.offer(que.poll());
            }
            sb.append(que.poll()+", ");
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);
    }
}