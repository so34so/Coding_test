// 구현
// top-down방식을 생각하면 경우의 수가 좀 더 줄기 때문에 최대에서 0까지 가는 방식으로 구해야햇다.
// 그래서 입력받은 수가 짝수이면 반으로 나눠주면 순간이동이기에 이동수를 추가안하고
// 홀수이면 1칸을 빼주는데 이것은 점프로 해당되니 ans++를 해준다.

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        while(n != 0){
            if(n%2==0){
                n /= 2;
            }else{
                n--;
                ans++;
            }
        }

        return ans;
    }
}