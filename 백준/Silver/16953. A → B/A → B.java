
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static long a,b;
    static int cnt;

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        System.out.println(bfs());
    }

    static int bfs(){
        Queue<Long> q = new LinkedList<>();
        q.offer(a);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                Long tmp = q.poll();
                if(tmp==b){
                    return cnt+1;
                }
                if(tmp*2<=b){
                    q.offer(tmp*2);
                }
                if(tmp*10+1<=b){
                    q.offer(tmp*10+1);
                }
            }
            cnt++;
        }
        return -1;
    }

}