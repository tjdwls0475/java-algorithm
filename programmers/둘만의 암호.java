import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<skip.length(); i++) set.add(skip.charAt(i) + 0);
        
        for (int i=0; i<s.length(); i++) {
            int j = index;
            char k = s.charAt(i);
            while (j > 0) {
                if (k >= 'z') k -= 26;
                
                if (set.contains(k + 1)) {
                    k += 1;
                    continue;
                }
                else {
                    k += 1;
                    j--;
                }
            }
            answer += (char) k;
        }
        
        return answer;
    }
}
