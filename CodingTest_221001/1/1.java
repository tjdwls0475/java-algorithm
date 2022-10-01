import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        // 중복을 피하기 위한 목적으로 HashSet 사용
        HashSet<String> HS = new HashSet<>();

        for(int num: arr) {
            String s = Integer.toString(num);
            char[] c = s.toCharArray();
            // 정렬시켜서 숫자 구성이 같으면 일치하도록 해서 애너그램 구하기
            Arrays.sort(c);
            HS.add(new String(c));
        }
        return HS.size();
    }
}
