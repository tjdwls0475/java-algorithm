class Solution {
    public long DFS(int n) {
    	if (n == 1) return 1;
    	else if (n == 2) return 1;
    	else return DFS(n-1) + DFS(n-2);
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	
    	for (int i=1; i<11; i++) {
    		System.out.print(T.DFS(i) + " ");
    	}
    }
}

// 가장 단순한 형태로 재귀를 이용하여 구현한 피보나치 수열입니다. 가독성이 좋아 직관적으로 이해가 쉽지만, 치명적인 단점이 있습니다. 
// 그 이유는 동일한 연산을 무수히 반복하게 때문인데요. 예를 들어, 피보나치 수열의 10번째 항을 계산한다고 해봅시다.
// 그러면 DFS(10)의 값은 DFS(9) + DFS(8) 연산의 결과 값입니다. 그런데 여기서 DFS(9)와 DFS(8)은 각각 DFS(8) + DFS(7)과 DFS(7) + DFS(6) 연산의 결과 값입니다.
// 위처럼 DFS(8) 값을 구하기 위해서 스택이 2개, DFS(7) 값을 구하기 위해서 스택이 3개, ... 이런 식으로 이미 계산된 결과 값을 구해내기 위해 연산이 여러 번 시행됩니다.
// 여기서 n의 값이 커진다면 이 스택의 수는 기하급수적으로 증가하게 되는데요. 이는 결국 재귀 함수의 성능을 급격하게 저하시킵니다.
