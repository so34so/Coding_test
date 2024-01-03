import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String[] nameArr = new String[n+1];
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=n;i++){
            String name = br.readLine();
            map.put(name,i);
            nameArr[i] = name;
        }

        while(m-- > 0){
            String s = br.readLine();
            if(Character.isDigit(s.charAt(0))){
                sb.append(nameArr[Integer.parseInt(s)]).append("\n");
            }else{
                sb.append(map.get(s)).append("\n");
            }
        }

        System.out.print(sb);

    }
}