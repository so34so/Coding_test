// dfs
// 특정 두 사람의 촌수만 구하면 되기에 모든 그래프를 전부 탐색할 필요가 없다 생각했고 
// 또한 촌수는 그래프가 아래로 내려가다 보니 dfs가 더 잘어울린다 생각했다.

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static List<Integer>[] relation;
    static boolean[] check;
    static int res = -1;

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        relation = new ArrayList[n+1];
        check = new boolean[n+1];
        for(int i=1;i<n+1;i++){
            relation[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int l = Integer.parseInt(br.readLine());

        for(int i=0;i<l;i++){
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            relation[b].add(c);
            relation[c].add(b);
        }

        dfs(x,y,0);
        System.out.println(res);
    }
    static void dfs(int start, int end, int cnt) {
        if(start == end) {
            res = cnt;
            return;
        }

        check[start] = true;
        for(int i=0; i<relation[start].size(); i++) {
            int next = relation[start].get(i);
            if(!check[next]) {
                dfs(next, end, cnt+1);
            }
        }
    }

}