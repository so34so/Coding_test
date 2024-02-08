// dfs
// n명의 회원이 있고, M개의 치킨 종류에 대한 각각의 선호도가 있다.
// 치킨 시키는 데 걸리는 시간을 줄이기 위해 최대 3종류의 치킨만 시킨다.
// 최댓값을 구해라.
// 3개의 치킨을 고른 후 각 멤버에 대해 고른 치킨들의 최댓값을 선택해 주었다.
// y == 3은 3개의 치킨을 고른 상태이다. 이 때 n명에 대해 각 최댓값을 구한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int result;
    static int[][] map;
    static boolean[] check;

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        check = new boolean[m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);

        System.out.println(result);
    }

    public static void dfs(int start, int y){
        if(y == 3){
            int sum = 0;
            for(int i=0;i<n;i++){
                int temp = 0;
                for(int j=0;j<m;j++){
                    if(check[j]){
                        temp = Math.max(temp, map[i][j]);
                    }
                }
                sum += temp;
            }
            result = Math.max(sum,result);
            return;
        }
        for(int i=start;i<m;i++){
            if(!check[i]){
                check[i] = true;
                dfs(i+1,y+1);
                check[i] = false;
            }
        }
    }

}
