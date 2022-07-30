class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            if(getNumber(i)) answer += i;
            else answer -= i;
        }

        return answer;
    }

    private boolean getNumber(int m) {
        boolean even = true;
        for(int i=1; i<=m; i++) {
            if(m%i == 0) even = !even;
        }
        return even;
    }
}
