import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());

    for(int i=0;i<T;i++){
      int num = Integer.parseInt(br.readLine());

      if(num==1){
        sb.append("0");
      }else{
        for(int j=1;j<=num;j++){
          if(j==1 || j == num){
            sb.append("1");
          }else{
            sb.append("2");
          }
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}