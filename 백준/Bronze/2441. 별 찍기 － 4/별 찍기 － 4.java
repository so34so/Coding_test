import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            int b = a-i;
            int c = a-b;
            for(int j=0;j<c;j++){
                sb.append(" ");
            }
            for(int z=0;z<b;z++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}