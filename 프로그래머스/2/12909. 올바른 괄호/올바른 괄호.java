// 스택
// 문자열이 괄호 ()로만 이루어져 있어서 이것에 대한 조건문 처리만 해주었다.
// 그래서 문자열을 받고 char을 하나씩 받아와 (일 경우 스택에 하나를 넣어주고 )일 경우 스택에서 하나를 빼준다.
// )일때 만약 스택이 비어있으면 이 경우는 올바르지 않은 괄호이기 때문에 바로 false를 return해준다.
// 모든 문자열이 끝났을 때 stack 안에 괄호가 남아있을 경우도 올바르지 않은 괄호이기 때문에 false를 return 해준다.
import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}