import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        String str = br.readLine();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }else if(str.charAt(i) == '>'){
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            if(flag == true){
                sb.append(str.charAt(i));
            }else if(flag == false){
                if(str.charAt(i) == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                }else{
                    stack.push(str.charAt(i));
                }
            }

            if(i==str.length()-1){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);

    }
}