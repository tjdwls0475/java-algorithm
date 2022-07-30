class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.matches(".*[a-zA-Z].*")) return false; // My first regex!!
        if(s.length() != 4 && s.length() != 6) return false;

        return answer;
    }
}
