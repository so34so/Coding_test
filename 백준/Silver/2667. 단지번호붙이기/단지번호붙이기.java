import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,count;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] check;
    static int[][] map;
    static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        result = new LinkedList<>();
        map = new int[N][N];
        check = new boolean[N][N];
        count = 1;

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] == 1 && !check[i][j]){
                    dfs(i,j);
                    result.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(result);
        sb.append(result.size()).append("\n");
        for(int n : result){
            sb.append(n).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int x, int y){
        check[x][y] = true;

        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny >= 0 && nx<N && ny< N){
                if(map[nx][ny] == 1 && !check[nx][ny]){
                    count++;
                    dfs(nx,ny);
                }
            }
        }
    }

}