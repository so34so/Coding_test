// BFS
// 범위가 넓어 bfs를 사용했다
// 현재 위치에서 범위에 벗어나지 않는 u,D의 방향을 탐색한다. 방문한 곳은 boolean체크를 해준다.
// 탐색 중 S==G를 만나면 move에 저장된 버튼 클릭 수를 출력한다. 목적지를 만나지 못하면 문제에서 요청한 값을 출력한다.

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int f,s,g;
    static int[] move;
    static int[] dir = new int[2];
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        dir[0] = Integer.parseInt(st.nextToken());
        dir[1] = -Integer.parseInt(st.nextToken());

        move = new int[f+1];
        bfs(s);
    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[f+1];

        q.add(start);
        check[start] = true;
        move[start] = 0;

        while(!q.isEmpty()){
            int pos = q.poll();

            if(pos == g){
                System.out.println(move[pos]);
                return;
            }

            for(int i=0;i<2;i++){
                int next = pos+dir[i];

                if(next >f || next<1){
                    continue;
                }

                if(!check[next]){
                    check[next] = true;
                    q.add(next);
                    move[next] = move[pos]+1;
                }

            }
        }
        System.out.println("use the stairs");
    }


}