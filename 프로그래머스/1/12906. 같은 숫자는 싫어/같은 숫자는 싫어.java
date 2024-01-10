import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                continue;
            }
            int a = stack.peek();
            if(a!=arr[i]){
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        int index = 0;
        for(int n : stack){
            answer[index++] = n;
        }

        return answer;
    }
}