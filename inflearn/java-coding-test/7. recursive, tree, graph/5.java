class Node {
	int data;
	Node lt, rt;
	
	public Node(int value) {
		this.data = value;
    lt = null;  // We don't normally need this.
    rt = null;
	}
}

class Solution {
	Node root;
	
	public static void main(String[] args) {
		Solution tree = new Solution();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
	
	private void DFS(Node root) {
		if (root == null) return;
		
		System.out.print(root.data + " ");
		DFS(root.lt);
		DFS(root.rt);
		
	}
}
