// dfs
// dfs를 돌면서 각각 노드의 값을 더하고 빼면서 깊이탐색 실행
// 마지막까지 갔으면 일치하면 answer++해줌

class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) answer++;
        }else{
            dfs(numbers, depth+1, target, sum + numbers[depth]);
            dfs(numbers, depth+1, target, sum - numbers[depth]);
        }
    }
}