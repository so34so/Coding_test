// 정렬
// 숫자를 문자열로 변경을 해서 비교를 한다.
// 그래서 문자열로 변경을 한 후 내림차순으로 정렬을 한다.
// 내림차순 하는것이 기억이 안나 검색해 봤다.
// 제일 큰 수가 0일 경우 뒤에 오는 것도 0이기에 무조건 0을 출력한다.
// 다음에 다시 풀어볼 것

import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if (arr[0].equals("0")) {
           return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }


        return sb.toString();
    }
}