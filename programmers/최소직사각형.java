class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = 0, y = 0;

        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > x) x = sizes[i][0];
            if(sizes[i][1] > y) y = sizes[i][1];
        }
        answer = x * y;

        return answer;
    }
}
