// 단순 구현
// 마지막 4번째까지는 *을 넣어준다.
// 이후 진행되는 길이에는 charAt()을 사용해서 그대로 넣어준다.
class Solution {
    public String solution(String number) {
        String answer = "";
        for(int i=0;i<number.length();i++){
            if(i<number.length()-4){
                answer += "*";
            }else{
                answer += number.charAt(i);
            }
        }
        return answer;
    }
}