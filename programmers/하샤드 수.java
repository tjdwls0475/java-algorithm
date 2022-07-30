class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        if(x % getSum(x) == 0) answer = true;
        else answer = false;
        
        return answer;
    }
    
    private int getSum(int m) {
        if(m < 1) return 0;
        else {
            return m%10 + getSum(m/10);
        }
    }
}
