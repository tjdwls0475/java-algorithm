class Solution {
    int cnt = 0;

    public int solution(int num) {
        if(num == 1) return 0;

        collatz((long)num);
        if(cnt <= 500) return cnt;
        else return -1;
    }

    private int collatz(long m) {
        if(cnt>500 || m == 1) return 0;
        else {
            cnt++;
            if(m%2 == 0) return collatz(m/2);
            else return collatz(m*3 + 1);
        }
    }
}
