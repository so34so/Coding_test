import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int map[][];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[9][9];
		for(int i=0;i<9;i++) {
			String str = br.readLine();
			for(int j=0;j<9;j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		sudoku(0,0);
		
	}
	public static void sudoku(int row, int col) {
		if(col==9) {
			sudoku(row+1,0);
			return;
		}
		if(row==9) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(map[row][col]==0) {
			for(int i=1;i<=9;i++) {
				if(check(row,col,i)) {
					map[row][col]=i;
					sudoku(row,col+1);
				}
			}
			map[row][col]=0;
			return;
		}
		sudoku(row,col+1);
	}
	private static boolean check(int row, int col,int value) {
		
		for(int i=0;i<9;i++	) {
			if(map[row][i]==value) {
				return false;
			}
		}
		for(int i=0;i<9;i++	) {
			if(map[i][col]==value) {
				return false;
			}
		}
		int set_row = (row/3)*3;
		int set_col = (col/3)*3;
		
		for(int i=set_row;i<set_row+3;i++) {
			for(int j=set_col;j<set_col+3;j++) {
				if(map[i][j]==value) {
					return false;
				}
			}
		}
		
		return true;
	}
}