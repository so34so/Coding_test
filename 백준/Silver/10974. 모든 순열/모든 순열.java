// 백트래킹
// n개의 자연수에서 n개를 고른 수열
// 방문한 곳과 방문하지 않은곳에 arr[x]에 i+1의 값을 넣어준다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int arr[];
    static boolean check[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        check = new boolean[N];

        dfs(0);
        System.out.println(sb.toString());
    }
    public static void dfs(int x){
        if(x == N){
            for(int i=0;i<N;i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            if(check[i]){
                continue;
            }
            arr[x] = i+1;
            check[i] = true;
            dfs(x+1);
            check[i] = false;
        }
    }
}