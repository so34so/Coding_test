import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(array);
        max = array[array.length-1];
        
        int count[] = new int[max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        max = count[0];
        for(int i=1;i<count.length;i++){
            if(max < count[i]){
                max = count[i];
                answer = i;
            }else if(max == count[i]){
                answer = -1;
            }
        }
        return answer;
    }
}