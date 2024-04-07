// 구현
// 배열 길이가 1 이면 -1을 넣고 return 한다.
// 현재 배열에서 제일 작은 값을 먼저 구하고 이것을 다시 모든 배열과 비교를 하며 다르면 만들어 둔 배열에 집어넣고 같으면 패스한다.

import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int min = arr[0];
        int[] answer = new int[arr.length - 1];
        
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        
        int n = 0;
        
        for(int i=0;i<arr.length;i++){
            if(min == arr[i]){
                continue;
            }else{
                answer[n++] = arr[i];
            }
        }
        
        return answer;
    }
}