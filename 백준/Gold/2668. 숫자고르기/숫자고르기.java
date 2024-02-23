import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  static int n;
  static int[] arr;
  static boolean[] check;
  static List<Integer> answer;
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    n = Integer.parseInt(br.readLine());
    check = new boolean[n+1];
    arr = new int[n+1];

    for(int i=1;i<=n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    answer = new ArrayList<>();
    
    for(int i=1;i<=n;i++){
      check[i] = true;
      dfs(i,i);
      check[i] = false;
    }
    
    Collections.sort(answer);
    
    sb.append(answer.size()).append("\n");
    for(int a:answer){
      sb.append(a).append("\n");
    }
    
    System.out.println(sb);
    
  }
  public static void dfs(int start, int target){
    if(arr[start]==target){
      answer.add(target);
    }
    
    if(!check[arr[start]]){
      check[arr[start]] = true;
      dfs(arr[start],target);
      check[arr[start]] = false;
    }
    
  }
  
}