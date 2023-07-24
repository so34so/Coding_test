class Solution {
    public int solution(String str) {
        str = str.replaceAll("[a-zA-z]","");
        String[] arr = str.split("");
        int answer = 0;
        for(int i=0;i<arr.length;i++){
            answer+=Integer.parseInt(arr[i]);
        }
        return answer;
    }
}