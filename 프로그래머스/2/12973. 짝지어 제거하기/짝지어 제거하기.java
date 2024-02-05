// 스택
// 짝지어 있는 char를 삭제하기 때문에 스택에 하나씩 넣어 그 다음에 오는 char를 비교를 하여 동일하면 해당 값을 삭제를 하고 
// 아니면 stack에 넣는다.
// 마지막으로 stack이 비어있는지 확인해서 비어있으면 1을 반환하고 아니면 0을 반환한다.
import java.util.Stack;

class Solution {
    public int solution(String str) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(!stack.isEmpty() && stack.peek().equals(a)){
                stack.pop();
            } else{
                stack.push(a);
            }
        }
        
        if(!stack.isEmpty()){
            answer = 0;
        }else{
            answer = 1;
        }
        
        return answer;
    }
}