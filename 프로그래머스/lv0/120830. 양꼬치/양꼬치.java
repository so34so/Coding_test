class Solution {
    public int solution(int n, int k) {
        int a = 12000;
        int b = 2000;
        int sum = 0;
        int x = 0;
        
        x = n/10;
        k-=x;
        
        sum = (n*12000) + (k*2000);
        
        return sum;
    }
}