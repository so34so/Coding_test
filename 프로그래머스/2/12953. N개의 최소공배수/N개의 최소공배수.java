// 수학
// 수학이라 검색했음
// N개의 수의 최소공배수를 구함으로 기존의 두 수의 최대공약수, 최소공배수를 구하는 방식과 다르게 answer의 값을 arr의 첫번째 값으로 고정
// 1번째 값과 2번째 값의 최소공배수를 answer에 반영하고 그 최소공배수와 다음 3번째의 최소공배수를 구한다.
// 1,2번째 최소공배수 값과 3번째 두 수의 최소공배수를 구한 값을 answer에 반영
// 같은 방법으로 마지막 인덱스의 값과도 최소공배수를 구해 반영

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i=1;i<arr.length;i++){
            answer = small(answer,arr[i]);
        }
        return answer;
    }
    static int big(int a, int b){
        if(a % b == 0){
            return b;
        }
        return big(b,a % b);
    }
    static int small(int a, int b){
        return a * b/ big(a,b);
    }
}