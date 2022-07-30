import java.util.LinkedList;
import java.util.Queue;

class Solution {
	Node root;
	
	public static void main(String[] args) {
		Solution tree = new Solution();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.rt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		System.out.println(tree.BFS(tree.root));
	}	
		
	private int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
}

class Node {
	int data;
	Node lt, rt;
	
	Node(int value) {
		this.data = value;
		this.lt = null;
		this.rt = null;
	}
}
