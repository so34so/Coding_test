// 구현
// 가로 리스트 세로 리스트를 만들어 최대 값들을 미리 넣어둔다.
// 이후 0과 1에 따라 나뉘는 가로와 세로에 맞게 리스트에 저장을 한다.
// 가장 큰 종이의 넓이를 구해야 함으로 sort로 정리를 하고 앞뒤 값을 비교해서 나온 값들을 비교해서 가장 큰값을 뽑아준다.
// 그럼 각각 가로 세로의 가장 큰 길이가 나오니까 곱해주면 가장 큰 넓이가 나온다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

    static int maxX;
    static int maxY;
    static ArrayList<Integer> col = new ArrayList<>();
    static ArrayList<Integer> row = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());



        col.add(0);
        col.add(x);
        row.add(0);
        row.add(y);

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if(type == 0){
                row.add(Integer.parseInt(st.nextToken()));
            }else if(type == 1){
                col.add(Integer.parseInt(st.nextToken()));
            }
        }

        Collections.sort(col);
        Collections.sort(row);

        rowCut();
        colCut();
        System.out.println(maxX * maxY);
    }

    public static void rowCut(){
        for(int i=0;i<row.size()-1;i++){
            int dis = row.get((i+1)) - row.get(i);
            maxY = Math.max(maxY,dis);
        }
    }

    public static void colCut(){
        for(int i=0;i<col.size()-1;i++){
            int dis = col.get((i+1)) - col.get(i);
            maxX = Math.max(maxX,dis);
        }
    }

}