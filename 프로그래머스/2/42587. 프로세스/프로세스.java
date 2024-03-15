// 우선순위 큐
// 우선순위 큐를 내림차순으로 만든다.
// 기존 우선순위 큐를 순회하며 현재 작업의 위치를 찾는다.
// 현재작업이 location이랑 같으면 answer를 보낸다.

import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for(int i: priorities){
            q.offer(i);
        }
        
        while(!q.isEmpty()){
            for(int i=0;i<priorities.length;i++){
                if(q.peek() == priorities[i]){
                    q.poll();
                    answer++;
                    
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}