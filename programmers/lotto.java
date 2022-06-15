class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero_cnt = 0;
        int match_cnt = 0;
        
        for (int x : lottos) {
            if (x == 0) {
                zero_cnt++;
                continue;
            }
            else for (int y : win_nums) {
                if (x == y) {
                    match_cnt++;
                    break;
                }
            }
        }
        answer[0] = Math.min(7 - match_cnt - zero_cnt, 6);
        answer[1] = Math.min(7 - match_cnt, 6);
        return answer;
    }
}
