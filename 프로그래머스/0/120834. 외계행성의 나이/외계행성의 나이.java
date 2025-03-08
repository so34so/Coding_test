class Solution {
    public String solution(int age) {
        String answer = "";
        String age2 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i=0; i<ageArr.length; i++){
            answer += age2.charAt(Integer.valueOf(ageArr[i]));
        }
        
        return answer;
    }
}