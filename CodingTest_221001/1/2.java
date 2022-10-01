import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		String input = "2(3(hi)co)";
		Main T = new Main();
		
		T.solution(input);
		System.out.println(T.solution(input));
	}
	
	public String solution(String s) {
		if(!s.contains("(")) return s;
		else return solution(DFS(s));
	}
	
	public String DFS(String compressed) {
        // String 간의 연산이 많아 StringBuilder가 더 효율적
        StringBuilder answer = new StringBuilder();

        for(int lt=0; lt<compressed.length(); lt++) {
            if(compressed.charAt(lt) == '(') {
                // 위 괄호로 압축된 부분만 index를 통해 구해오기
                int rt = getLength(compressed.substring(lt+1));
                String string = compressed.substring(lt+1, lt+rt);
                // 압축된 부분의 개수 구하기
                int n2 = getNumber(compressed.substring(0,lt));
                // 압축된 부분을 풀어서 StringBuilder에 붙여주기
                for(int i=0; i<n2; i++) answer.append(string);
                // 압축울 풀고 난 다음 부분부터 순회
                lt += rt;
            }
            else if(compressed.charAt(lt) == ')') continue;
            else if(Character.isDigit(compressed.charAt(lt))) continue;
            // 압축되지 않은 부분은 그대로 StringBuiler에 붙여주기
            else answer.append(compressed.charAt(lt));
        }

        return answer.toString();
    }

    private int getLength(String s) {
        // Stack 자료구조를 이용해서 해당 괄호의 범위를 구하기
        Stack<Character> stack = new Stack<>();
        stack.add('(');
        //System.out.println(stack.size());
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') stack.pop();
            else if(s.charAt(i) == '(') stack.add('(');
            else continue;
            
            if(stack.size() == 0) return i+1;
        }
        // 해당 괄호가 끝나지 않으면 압축 과정이 잘못된 것이므로 -1 리턴
        return -1;
    }

    private int getNumber(String s) {
        String tmp = "";

        for(int i=s.length()-1; i>=0; i--) {
            if(Character.isDigit(s.charAt(i))) tmp = s.charAt(i) + tmp;
            else break;
        }

        return Integer.parseInt(tmp);
    }
}
