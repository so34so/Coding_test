// 이분탐색
// 예산을 배열에 저장하면서 최대 금액도 비교해서 저장한다.
// left-right로 반복해서 찾는다.
// 중간 예산으로 얻을 수 있는 예산을 반복해서 더한다.
// b<=m이면 아직 총량에 도달하지 않았으므로 left = mid+1;
// b>m이면 예산이 초과되었으므로 right= mid-1;이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int left = 0;
        int right = -1;
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right,arr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        while(left<=right){
            int mid = (left+right)/2;
            long b = 0;
            for(int i=0;i<n;i++){
                if(arr[i]>mid){
                    b += mid;
                }else{
                    b += arr[i];
                }
            }
            if(b<=m){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println(right);
    }

}