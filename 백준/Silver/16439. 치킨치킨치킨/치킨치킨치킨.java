// bfs, 그리디
// 연산이 두가지다 2를 곱한다, 1을 수의 가장 오른쪽에 추가한다.
// 두가지 뿐이라 전부 해보면서 빠르게 할 수 있게 bfs를 사용했다.
// 맨처음 숫자를 a라 명명하고 이를 큐에 넣어 둔다. 이후 큐의 사이즈 만큼 반복해서 들어있는 모든 숫자에 해당하는 연산을 전부 적용해서 다시 큐에 저장을 한다.
// 이러면 한번의 cnt에 다양한 연산을 한 결과값들이 큐에 저장이 된다. 사이즈 만큼 반복이 끝나면 한번의 연산이 끝난거니 cnt를 1 추가해 준다.
// 이 과정을 반복하면 원하는 값 B가 나오거나 나오지 않게 된다.
// B가 나올 경우는 결국 연산을 한번 진행을 한거니 추가로 cnt에 1을 더해주고 결과값을 내준다.
// 만약 B가 나오지 않은채 큐가 비어버리면 원하는 값이 나오지 않은채 값이 커진것이므로 만들 수 없는 경우가 되어 -1을 결과값으로 내준다.
// 특이사항
//    int로 하면 실패하는 경우가 있다. 그래서 long으로 했더니 성공을 했다.

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