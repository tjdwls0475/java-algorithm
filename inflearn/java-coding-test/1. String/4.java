import java.util.ArrayList;
import java.util.Scanner;

public class algo {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
			String tmp = new StringBuilder(x).reverse().toString();  // StringBuilder instance is totally diffrent from String.
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
