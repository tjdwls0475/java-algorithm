class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        for(char x : s.toCharArray()) {
            if(Character.toLowerCase(x) == 'p') cnt++;
            if(Character.toLowerCase(x) == 'y') cnt--;
        }

        if(cnt != 0) answer = !answer;
        return answer;
    }
}
