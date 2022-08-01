class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = "";

        if(s.charAt(0)=='+') {
            for(int i=1; i<s.length(); i++) tmp += s.charAt(i);
            answer = Integer.parseInt(tmp);
        }
        else if(s.charAt(0)=='-') {
            for(int i=1; i<s.length(); i++) tmp += s.charAt(i);
            answer = Integer.parseInt(tmp) * -1;
        }
        else answer = Integer.parseInt(s);

        return answer;
    }
}
// Actually, 'parseInt' can handle everything.
