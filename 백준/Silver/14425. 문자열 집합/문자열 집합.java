import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] str = new String[N];
        String[] str2 = new String[M];
        int cnt = 0;
        for(int i=0;i<N;i++){
            str[i] = br.readLine();
        }
        for(int j=0;j<M;j++){
            str2[j] = br.readLine();
        }
        for(int i=0;i<N;i++){
            String text = str[i];
            for(int j=0;j<M;j++){
                String text2 = str2[j];
                if(text.equals(text2)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}