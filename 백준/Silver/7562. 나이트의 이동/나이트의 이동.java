import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,a;
    static int x1,x2,y1,y2;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {1,2,2,1,-1,-2,-2,-1};
    static int[] dy = {2,1,-1,-2,-2,-1,1,2};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            a = Integer.parseInt(br.readLine());
            arr = new int[a][a];
            check = new boolean[a][a];

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            bfs();
            sb.append(arr[x2][y2]).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x1,y1});
        check[x1][y1]=true;

        while(!q.isEmpty()){
            int[] now = q.poll();
            int rx = now[0];
            int ry = now[1];
            for(int i=0;i<8;i++){
                int nx = rx + dx[i];
                int ny = ry + dy[i];
                if(nx >=0 && ny >=0 && nx<a && ny<a){
                    if(!check[nx][ny]){
                        q.offer(new int[]{nx,ny});
                        arr[nx][ny] = arr[rx][ry] +1;
                        check[nx][ny] = true;
                    }
                }
            }
        }
    }
}