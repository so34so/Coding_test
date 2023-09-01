class Solution {
    public boolean solution(int x) {
        boolean answer = false;

        int sum = 0;
        int y = x;
        
        while(y>=1){
            sum += y%10;
            y = y/10;
            
            
        }
        
        if(x%sum==0)answer = true;
        
        return answer;
    }
}