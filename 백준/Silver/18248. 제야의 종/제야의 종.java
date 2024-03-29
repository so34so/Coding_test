import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] people = new int[N][M+1];

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0;j<M;j++){
                people[i][j] = Integer.parseInt(st.nextToken());
                sum += people[i][j];
            }
            people[i][M] = sum;
        }

        Arrays.sort(people,(e1,e2)->{
            return e2[M] - e1[M];
        });

        boolean answer = true;
        loop: for(int m=0;m<M;m++){
            int check = people[0][m];
            for(int n=0;n<N;n++){
                if(check <people[n][m]){
                    answer = false;
                    break loop;
                }
                check = people[n][m];
            }
        }
        if(answer){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}