import java.util.ArrayList;
import java.util.Scanner;

public class algo {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
			char[] y = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt < rt) {
				char tmp = y[lt];
				y[lt] = y[rt];
				y[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(y);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		algo T = new algo();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = input.next();
		}
		for(String x: T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
