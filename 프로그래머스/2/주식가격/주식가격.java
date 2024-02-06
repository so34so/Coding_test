// 큐
// 앞의 배열과 값을 비교해서 값이 작지 않으면 해당 answer배열의 해당 위치의 값을 1을 더해준다.
// 배열의 첫번째 숫자가 그렇게 전부 비교해서 값이 작아지는 순간이 있으면 반복문을 멈추고 다음 배열 숫자로 넘어간다.

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();

        for (int p : prices) {
            q.add(p);
        }

        int num = 0;
        while (q.peek() != null) {
            int value = q.poll();

            answer[num] = 0;

            for (Integer integer : q) {
                answer[num]++;
                if (value > integer) {
                    break;
                }
            }

            num++;
        }

        return answer;
    }
}