// 행렬곱셈, 누적합
// 행렬곱셈이 뭐였는지 기억이 나지 않아 많이 검색했다.
// 연산은 앞쪽의 열과 뒤쪽의 행이 같아야 이루어질 수 있다.
// 연산의 결과 행렬의 크기는 앞쪽의 행 * 뒤쪽의 열 이다.
// answer[i][j] += arr1[i][k] * arr2[k][j];를 통해 누적합으로 계산 되는거를 지속적으로 더해준다.

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<arr1.length; i++){
            for(int j=0;j<arr2[0].length; j++){
                for(int k=0;k<arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}