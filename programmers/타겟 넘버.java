class Solution {
    static int[] check;
    static int n;
    static int target;
    static int[] numbers;
    static int cnt = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        check = new int[numbers.length + 1];
        this.n = numbers.length;
        this.target = target;
        this.numbers = numbers;

        DFS(1);

        return cnt;
    }

    private void DFS(int m) {
        if(m > n) {
            int sum = 0;
            for(int i=1; i<n+1; i++) {
                sum += numbers[i-1] * check[i];
            }
            if(sum == target) cnt++;
            return;
        }
        else {
            check[m] = 1;
            DFS(m+1);
            check[m] = -1;
            DFS(m+1);
        }
    }   
}
