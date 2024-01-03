import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            }else{
                map.put(name,state);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        for(var li : list){
            sb.append(li).append("\n");
        }
        System.out.println(sb);
    }
}