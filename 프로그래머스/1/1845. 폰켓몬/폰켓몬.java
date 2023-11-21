import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length/2;
        HashSet<Integer> a = new HashSet<>();
        
        for(int num : nums){
            a.add(num);
        }
        
        if(a.size()>max){
            return max;
        }else{
            return a.size();
        }
        
    }
}