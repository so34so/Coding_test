import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        int num = Integer.parseInt(br.readLine());
        while(num>0){
            int x = num%10;
            num = num/10;
            arr[x]++;
        }
        int max =arr[0];
        if(num==0){
            max = 1;
        }
        int maxNum = 0;
        for(int i=0;i<arr.length;i++){
            if(i==6 || i==9) continue;
            if(max<arr[i]){
                max = arr[i];
            }
        }
        max = Math.max(max,(arr[6]+arr[9]+1)/2);
        System.out.println(max);

    }
}