import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] map;
    static boolean[][] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Queue<int[]> q = new LinkedList<>();

        map = new int[N][M];
        check = new boolean[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int num = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j] == 0 || check[i][j]){
                    continue;
                }
                num++;
                check[i][j] = true;
                q.offer(new int[]{i,j});
                int area = 0;
                while(!q.isEmpty()){
                    area++;
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for(int dir = 0; dir<4;dir++){
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if(nx<0 || ny<0 || nx>=N || ny >= M){
                            continue;
                        }
                        if(check[nx][ny] || map[nx][ny] != 1){
                            continue;
                        }
                        check[nx][ny] = true;
                        q.offer(new int[]{nx,ny});
                    }
                }
                max = Math.max(max,area);
            }
        }
        sb.append(num + "\n" + max);
        System.out.println(sb);
    }
}