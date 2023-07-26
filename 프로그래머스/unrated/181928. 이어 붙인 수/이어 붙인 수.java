class Solution {
    public int solution(int[] list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int i=0;i<list.length;i++){
            if(list[i]%2==0){
                a += Integer.toString(list[i]);
            }else{
                b += Integer.toString(list[i]);
            }
        }
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        answer = x+y;
        return answer;
    }
}