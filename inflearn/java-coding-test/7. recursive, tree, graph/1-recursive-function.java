// '재귀함수'란 함수가 자기 자신을 다시 호출하는 함수입니다. 자기 자신을 다시 호출할 때, '매개변수', '지역변수', '복귀주소' 세 가지를 기록해두고 다음 함수로 넘어갑니다.
// 대부분의 경우, 재귀적 방법은 반복적 방법으로 해결할 수 있습니다. 재귀적 방법을 쓰게 되면 컴퓨터 메모리에 함수 스택이 중첩되어 쌓이면서 효율이 떨어지는데도 불구하고,
// 사용하는 이유는 가독성이 좋기 때문입니다.

import java.util.*;

class Solution {
    public void DFS(int n) {
        if (n == 0) return;
        
        DFS(n-1);
        System.out.print(n);
        return;
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	T.DFS(5);
    }
}
