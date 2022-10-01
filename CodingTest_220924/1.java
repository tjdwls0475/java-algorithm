import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    HashMap<String,Integer> HM = new HashMap<>();
    String today;
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        this.today = today;
        int count = 1;

        for(String term: terms) {
            String[] tmp = term.split(" ");
            HM.put(tmp[0], Integer.parseInt(tmp[1]));
        }

        for(String privacy: privacies) {
            String[] tmp = privacy.split(" ");
            //System.out.println(tmp[1]);
            if(getTime(tmp[0], HM.get(tmp[1]))) answer.add(count);
            count++;
        }

        return answer;
    }

    private boolean getTime(String date, int month){
        // Java에서 '.'으로 split하려면 아래와 같은 문법으로 해야한다.
        String[] startDates = date.split("[.]");
        String[] todayDates = today.split("[.]");
        int sum = 0;
        sum = (Integer.parseInt(todayDates[0]) - Integer.parseInt(startDates[0]))*12 + (Integer.parseInt(todayDates[1]) - Integer.parseInt(startDates[1]));
        if(sum < month) return false;
        else if(sum == month && (Integer.parseInt(todayDates[2]) < Integer.parseInt(startDates[2]))) return false;
        else return true;
    }
}
