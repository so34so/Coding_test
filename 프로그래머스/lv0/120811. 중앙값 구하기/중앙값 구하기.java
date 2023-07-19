import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int x = array.length/2;
        answer = array[x];
        return answer;
    }
}