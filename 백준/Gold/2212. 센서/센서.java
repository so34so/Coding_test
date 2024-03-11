// 그리디
// k개의 집중국으로 모든 센서를 커버할 수 있도록 하는 각 집중국 범위의 합을 구해야 한다.
// 만약 집중국 갯수가 센서 갯수보다 크면 0을 출력한다.
// 센서의 거리를 오름차순 정렬
// 센서 거리 차이를 배열로 담고(지금 +1 과 지금의 차이를 구한 값) 해당 배열을 내림차순한다.
// 차이 배열의 k-1부터 마지막까지 합을 출력한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        if(k>=n){
            System.out.println(0);
            return;
        }
        int sum = 0;

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Integer[] dArr = new Integer[n-1];
        for(int i=0;i<n-1;i++){
            dArr[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(dArr, Collections.reverseOrder());

        for(int i=k-1;i<n-1;i++){
            sum += dArr[i];
        }
        System.out.println(sum);

    }

}