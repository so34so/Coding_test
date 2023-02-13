import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(br.readLine());
		}
		int number = list.get(0).length();
		for(int i=0;i<number;i++) {
			List<String> subList = new ArrayList<>();
			for(int j=0;j<N;j++) {
				String tempNumber = list.get(j);
				tempNumber = tempNumber.substring(number - i - 1, number);
				
				if(!subList.contains(tempNumber)) {
					subList.add(tempNumber);
				}else {
					break;
				}
			}
			if(N==subList.size()) {
				System.out.println(i+1);
				break;
			}
		}
	}
}