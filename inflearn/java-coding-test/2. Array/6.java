import java.util.ArrayList;
import java.util.Scanner;

public class algo {
	public boolean isPrime(int num) {  // It's easy to find check whether or not the given number is prime.
		if(num == 1) return false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {  // This is how to reverse number.
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				tmp = tmp/10;
				res = res*10 + t;
			}
			if(isPrime(res)) answer.add(res);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		algo T = new algo();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int x: T.solution(n, arr)) {
			System.out.println(x + " ");
		}
	}
}
