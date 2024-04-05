// 스택
// 오큰수 = 원래 원소보다 큰 수 중 가장 왼쪽에 있는 원소
// 수열을 탐색하면서 현재 원소가 이전의 원소보다 작을 때까지 stack에 수열의 index를 추가한다.
// 만약 현재 원소가 스택의 top 원소를 인덱스로 하는 수열의 원소보다 크게 될 경우 pop하면서 해당 인덱스에 해당하는 원소들을 현재 원소로 바꿔준다.
// 어렵다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        Stack<Integer> s = new Stack<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++){
            while(!s.isEmpty() && seq[s.peek()] < seq[i]){
                seq[s.pop()] = seq[i];
            }
            s.push(i);
        }

        while(!s.isEmpty()){
            seq[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);
    }

}