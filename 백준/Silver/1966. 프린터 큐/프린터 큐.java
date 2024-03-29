import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> que = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<N;i++){
                que.offer(new int[] {i,Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while(!que.isEmpty()){
                int[] front = que.poll();
                boolean isMax = true;

                for(int i=0;i<que.size();i++){
                    if(front[1] < que.get(i)[1]){
                        que.offer(front);
                        for(int j=0;j<i;j++){
                            que.offer(que.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if(isMax == false){
                    continue;
                }

                cnt++;
                if(front[0] == M){
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}