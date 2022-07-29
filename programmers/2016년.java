class Solution {
    public String solution(int a, int b) {
        // Make variables
        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] numOfDays = {31,29,31,30,31,30,31,31,30,31,30,31};
        int cnt = 0;
        
        // Sum
        for (int i=0; i<a-1; i++) {
            cnt += days[i];
        }
        cnt += b;
        
        // Check
        if (cnt%7 == 1) return days[day%7];
        else if (cnt%7 == 2) return days[day%7];
        else if (cnt%7 == 3) return days[day%7];
        else if (cnt%7 == 4) return days[day%7];
        else if (cnt%7 == 5) return days[day%7];
        else if (cnt%7 == 6) return days[day%7];
        else return cnt[day%7];
    }
}
