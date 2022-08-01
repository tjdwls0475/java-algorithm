import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for(int j=0; j<strings.length+5; j++) {
            for(int i=0; i<strings.length-1; i++) {
                if(strings[i] != getPriority(strings[i], strings[i+1], n)) {
                    String tmp = strings[i];
                    strings[i] = getPriority(strings[i], strings[i+1], n);
                    strings[i+1] = tmp;
                }
            }
        }

        answer = strings;
        return answer;
    }

    private String getPriority(String s1, String s2, int m) {
        if(m > 100) return "Equal!";
        if(s1.charAt(m) == s2.charAt(m)) return getPriority2(s1, s2, 0);
        else if(s1.charAt(m) < s2.charAt(m)) return s1;
        else return s2;
    }

        private String getPriority2(String s1, String s2, int m) {
        if(m > 100) return "Equal!";
        if(s1.charAt(m) == s2.charAt(m)) return getPriority2(s1, s2, m+1);
        else if(s1.charAt(m) < s2.charAt(m)) return s1;
        else return s2;
    }
}
