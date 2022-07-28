import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> HS = new HashSet<>();
        
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                HS.add(numbers[i] + numbers[j]);
            }
        }
        
        Iterator iter = HS.iterator();
      
        while(iter.hasNext()) {
        	answer.add((int) iter.next());  // Only one per iter.next()
        }
      
        Collections.sort(answer);
      
        return answer;
    }
    

}
// HashSet(X) TreeSet(O)
