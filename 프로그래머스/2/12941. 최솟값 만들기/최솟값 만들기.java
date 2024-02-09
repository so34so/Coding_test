// 구현
// 간단한 문제
// 각 원소를 곱하여 가장 작은 수를 만드는 방법은 각 배열의 가장 작은 수 * 가장 큰 수 이다.
// 일단 둘다 sort를 하여 오름 차순을 하고 하나는 A길이에서 1을 빼주면 마지막부터 가고 이후 i를 빼줌으로 둘의 위치를 맞춰준다.

import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<A.length;i++){
            answer = answer+(A[i] * B[A.length-1-i]);
        }

        return answer;
    }
}