import java.util.*;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		StringBuilder b = new StringBuilder();
		
		new_id = new_id.toLowerCase();
		
        char[] new_id_arr = new_id.toCharArray();
        ArrayList new_id_list = new ArrayList<Character>();
        
        for (char x : new_id_arr) {
        	new_id_list.add(x);
        }

        
        for (int i=new_id_list.size() - 1; i >= 0; i--) {
        	char[] specials = {'~','!','@','#','$','%','^','&','*','(',')','=','+','[','{',']','}',':','?',',','<','>','/'};
        	
        	for (char y : specials) {
        		if (new_id_list.get(i).toString().charAt(0) == y) {
        			new_id_list.remove(i);
        			break; // which resolves Array out of index Error.
        		}
        	}
        }
        int cnt=0;
        for (int i=new_id_list.size() - 1; i >= 0; i--) {
        	if (new_id_list.get(i).toString().charAt(0) == '.') {
        		++cnt;
        	} else --cnt;
        	if (cnt == 2) {
        		new_id_list.remove(i);
        		--cnt;  // cnt cannot be minus.
        	}
        	if (cnt < 0) {
        		cnt = 0;
        	}
        }
        
        while (!new_id_list.isEmpty() && new_id_list.get(0).toString().charAt(0) == '.') {
        	new_id_list.remove(0);
        }
        while (!new_id_list.isEmpty() && new_id_list.get(new_id_list.size()-1).toString().charAt(0) == '.') {
        	new_id_list.remove(new_id_list.size()-1);
        }
        
        if (new_id_list.size() == 0) {
        	new_id_list.add('a');
        }
        
        while (new_id_list.size() > 15) {
        	new_id_list.remove(new_id_list.size()-1);
        }
        
        while (new_id_list.get(new_id_list.size()-1).toString().charAt(0) == '.') {
        	new_id_list.remove(new_id_list.size()-1);
        }
        
        while (new_id_list.size() < 3) {
        	new_id_list.add(new_id_list.get(new_id_list.size()-1));
        }

		answer = new_id_list.toString();
		System.out.println(answer.getClass());
		
		int i = 0;
		
		while (i < new_id_list.size()) {
			b.append(new_id_list.get(i));
			i++;
		}
		
		answer = b.toString();
		
		return answer;
	}
} 
