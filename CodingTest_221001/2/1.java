import java.util.Arrays;

class Solution {
    String[] registered_list;
    String S;
    int N;

    public String solution(String[] registered_list, String new_id) {
        this.registered_list = registered_list;
        Arrays.sort(this.registered_list);
        if(checkValidity(new_id)) return new_id;
        
        int idx = getLastStringIndex(new_id);
        // 문자열만으로 구성된 케이스와 문자열과 숫자로 구성된 케이스를 진작 분리했어야함
        if(idx == new_id.length()) {
            this.S = new_id;
            this.N = 0;
            return DFS2();
        }
        else {
            this.S = new_id.substring(0, idx);
            this.N = Integer.parseInt(new_id.substring(idx));
            return DFS1();
        }
    }

    private String DFS1() {
        if(checkValidity(S + Integer.toString(N))) return S + Integer.toString(N);
        else {
            N++;
            return DFS1();
        }
    }

    private String DFS2() {
        if(N==0) {
            N++;
            return DFS2();
        }
        else if(checkValidity(S + Integer.toString(N))) return S + Integer.toString(N);
        else {
            N++;
            return DFS2();
        }
    }

    private boolean checkValidity(String id) {
        for(String list: registered_list) {
            if(list.equals(id)) {
                System.out.println("right");
                return false;
            }
        }
        return true;
    }

    private int getLastStringIndex(String s) {
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) return i;
        }
        return s.length();
    }
}
