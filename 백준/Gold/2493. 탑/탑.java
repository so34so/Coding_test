import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(stack.isEmpty()){
                sb.append(0 + " ");
            }else{
                while(true){
                    int[] data = stack.peek();
                    int idx = data[0];
                    int number = data[1];
                    if(number > num){
                        sb.append(idx + " ");
                        break;
                    }else{
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        sb.append(0 + " ");
                        break;
                    }
                }
            }
            stack.push(new int[]{i+1,num});
        }
        System.out.println(sb);
    }
}