// 좌표압축
// 배열의 각 원소 값에 대한 순위를 매기는 것이다.
// 낮은 값이 높은 순위를 갖는다. 중복되는 원소는 같은 순위를 갖는다.
// 오름차순으로 정렬을 했을 때 첫 번째 인덱스에 있는 원소가 가장 높은 순위를 갖고, 가장 마지막에 있는 원소가 낮은 순위를 갖는다.
// 원 본 배열을 오름차순 정렬한다.
// 정렬된 배열을 map에 하나씩 추가하면서 순위를 매긴다.
// 원본 배열을 차례대로 순회하면서 map에 있는 원소에 대한 value를 갖고온다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer,Integer> ranking = new HashMap<Integer,Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;

        for(int v : sorted){
            if(!ranking.containsKey(v)){
                ranking.put(v,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            int T = ranking.get(key);
            sb.append(T).append(" ");
        }
        System.out.println(sb);
    }

}