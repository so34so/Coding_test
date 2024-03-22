import java.util.*;
import java.io.*;

public class Main {

  static int[] dx = {0,0,1,-1,1,-1,1,-1};
  static int[] dy = {-1,1,0,0,1,1,-1,-1};
  static int[][] map;
  static boolean[][] check;
  static int w,h;
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());

      if(w == 0 && h== 0){
        break;
      }

      map = new int[h][w];
      check = new boolean[h][w];

      for(int i=0;i<h;i++){
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<w;j++){
          map[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      int cnt = 0;
      
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(map[i][j] == 1 && !check[i][j]){
            dfs(i,j);
            cnt++;
          }
        }
      }
      System.out.println(cnt);
    }
    
  }

  public static void dfs(int x,int y){
    check[x][y] = true;

    for(int i=0;i<8;i++){
      int ndx = x + dx[i];
      int ndy = y + dy[i];

      if(ndx >= 0 && ndy >= 0 && ndx < h && ndy < w){
        if(map[ndx][ndy] == 1 && !check[ndx][ndy]){
          dfs(ndx,ndy);
        }
      }
    }
  }

}