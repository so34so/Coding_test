import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int[][] map = new int[N+1][3];
    
    for(int i=1;i<=N;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j=0;j<3;j++){
          map[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    int[][] maxMap = new int[N+1][3];
    int[][] minMap = new int[N+1][3];

    for(int i=1;i<=N;i++){
      maxMap[i][0] = Math.max(maxMap[i-1][0],maxMap[i-1][1]) + map[i][0];
      maxMap[i][1] = Math.max(Math.max(maxMap[i-1][0],maxMap[i-1][1]),maxMap[i-1][2]) + map[i][1];
      maxMap[i][2] = Math.max(maxMap[i-1][1],maxMap[i-1][2]) + map[i][2];

      minMap[i][0] = Math.min(minMap[i-1][0],minMap[i-1][1]) + map[i][0];
      minMap[i][1] = Math.min(Math.min(minMap[i-1][0],minMap[i-1][1]),minMap[i-1][2]) + map[i][1];
        minMap[i][2] = Math.min(minMap[i-1][1],minMap[i-1][2]) + map[i][2];
    }

    int max = 0;
    int min = 10000000;
    
    for(int i=0;i<3;i++){
      max = Math.max(max,maxMap[N][i]);
      min = Math.min(min,minMap[N][i]);
    }

    System.out.println(max + " " + min);
  }

}