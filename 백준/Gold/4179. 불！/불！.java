import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair{
    int x;
    int y;
    public Pair(int y, int x){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] map,check;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int R,C;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        check = new int[R][C];
        Queue<Pair> jq = new LinkedList<>();
        Queue<Pair> fq = new LinkedList<>();

        for(int i=0;i<R;i++){
            String t = br.readLine();
            for(int j=0;j<C;j++){
                char temp = t.charAt(j);
                if(temp == 'J'){
                    map[i][j] = 1;
                    jq.offer(new Pair(i,j));
                }else if(temp == 'F'){
                    map[i][j] = -2;
                    fq.offer(new Pair(i,j));
                }else if(temp == '#'){
                    map[i][j] = -1;
                }else{
                    map[i][j] = 0;
                }
            }
        }
        int answer = 0;
        while(true){
            answer++;
            int fs = fq.size();
            while (fs > 0) {
                fs--;
                Pair node = fq.poll();

                for(int i=0;i<4;i++){
                    int ny = node.y + dy[i];
                    int nx = node.x + dx[i];
                    if(nx >=0 && ny>0 && nx<C && ny<R){
                        if(map[ny][nx] >= 0){
                            fq.add(new Pair(ny,nx));
                            map[ny][nx] = -2;
                        }
                    }
                }
            }

            int js = jq.size();
            while(js>0){
                js--;
                Pair node = jq.poll();
                for(int i=0;i<4;i++){
                    int ny = node.y + dy[i];
                    int nx = node.x + dx[i];
                    if(nx < 0 || ny < 0 || nx >= C || ny >= R){
                        System.out.println(answer);
                        return;
                    }
                    if(map[ny][nx]==0){
                        jq.add(new Pair(ny,nx));
                        map[ny][nx] = 1;
                    }
                }
            }
            if(jq.isEmpty()){
                System.out.println("IMPOSSIBLE");
                return;
            }
        }
    }
}