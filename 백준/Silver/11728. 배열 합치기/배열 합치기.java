import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       int c = a+b;
       int[] arr = new int[c];

       st = new StringTokenizer(br.readLine());

       for(int i=0;i<a;i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }
       st = new StringTokenizer(br.readLine());

       for(int i=0;i<b;i++){
           arr[i+a] = Integer.parseInt(st.nextToken());
       }

       Arrays.sort(arr);

       StringBuilder sb = new StringBuilder();
       for(int i=0;i<arr.length;i++){
           sb.append(arr[i]).append(" ");
       }
       System.out.println(sb);
    }

}