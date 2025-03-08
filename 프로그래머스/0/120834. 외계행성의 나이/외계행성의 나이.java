class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageArr = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        
        while(age>0){
            answer = ageArr[age % 10] + answer;
            age /= 10;
        }
        
        return answer;
    }
}
