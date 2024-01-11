import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int open = 0;
        int ans = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c=='('){
                open++;
            }else{
                open--;
                if(str.charAt(i-1)=='('){
                    ans += open;
                }else{
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}