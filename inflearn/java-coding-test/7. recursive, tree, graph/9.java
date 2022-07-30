class Solution {
	Node root;
	
	public static void main(String[] args) {
		Solution tree = new Solution();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		tree.DFS(0, tree.root);
		System.out.println(tree.DFS(0, tree.root));
	}	
		
	private int DFS(int L, Node root) {
		if(root.lt == null || root.rt == null) return L;
		else {
			return Integer.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
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
