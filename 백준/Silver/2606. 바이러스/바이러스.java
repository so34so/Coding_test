import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m,count;
    static int[][] arr;
    static boolean[] check;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws NumberFormatException, IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       n = Integer.parseInt(br.readLine());
       m = Integer.parseInt(br.readLine());
       arr = new int[n+1][n+1];
       check = new boolean[n+1];
       for(int i=0;i<m;i++){
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           arr[a][b] = arr[b][a] = 1;
       }
       bfs(1);
       for(int i=2;i<=n;i++){
           if(check[i]){
               count++;
           }
       }
       System.out.println(count);
    }
    public static void bfs(int x){
        q.offer(x);
        check[x] = true;
        while(!q.isEmpty()){
            int t = q.poll();
            for(int i=0;i<=n;i++){
                if(!check[i] && arr[t][i] == 1){
                    check[i] = true;
                    q.offer(i);
                }
            }
        }

    }

}