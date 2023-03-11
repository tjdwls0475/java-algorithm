class Solution {
    static long[] fibo; // Memoization Method
	
    public long DFS(int n) {
    	if (fibo[n] > 0) return fibo[n]; // When int array is initialized, the default value is zero. By doing this, we avoid repetitive calculation.
    	
    	if (n == 1) return fibo[n] = 1;
    	else if (n == 2) return fibo[n] = 1;
    	else return fibo[n] = DFS(n-1) + DFS(n-2);
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	int n = 60;
    	fibo = new long[n+1];
    	T.DFS(n);
    	
    	for (int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}

// 앞서 단순한 형태의 재귀 함수로 피보나치 수열 값을 구하는 코드에 대해 살펴봤습니다. 이전 코드는 단순한 만큼 같은 연산을 반복하는 바람에 성능이 좋지 않았는데요.
// 이번에는 '메모이제이션' 또는 '캐싱' 기법을 통해 성능을 개선해보도록 하겠습니다.
// 전역 변수로 선언한 fibo가 바로 연산된 결과값을 저장할 배열입니다. 배열의 크기는 n+1로 선언하여 배열의 index와 피보나치 수열의 index가 일치하도록 하였습니다.
// 그리고 재귀함수 DFS에서 맨 처음에 조건문을 하나 추가하여 fibo 배열에 이미 연산된 결과값이 존재한다면 바로 그 값을 리턴받을 수 있도록 구현하였습니다.
// 그 결과 동일한 연산을 되풀이하면서 함수의 스택이 쌓이는 것을 막았고 성능은 크게 개선되었습니다.
