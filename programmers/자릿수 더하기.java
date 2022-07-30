public class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = getSum(n);

        return answer;
    }

    private int getSum(int m) {
        if(m<1) return 0;
        else {
            return m%10 + getSum(m/10);
        }
    }
}
