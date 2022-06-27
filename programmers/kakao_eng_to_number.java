import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, Integer> HM = new HashMap<>();
        
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<10; i++) {
            HM.put(numbers[i], i);
        }
        
        for (String number : HM.keySet()) {
            while (s.contains(number)) {
                s = s.replace(number, Integer.toString(HM.get(number)));
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
