import java.util.Scanner;

public class algo {
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {  // Sieve of Eratosthenes
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j+=i) {
					ch[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		algo T = new algo();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(T.solution(n));
		input.close();
	}
}
