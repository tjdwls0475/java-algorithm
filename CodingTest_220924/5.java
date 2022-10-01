import java.util.Stack;

class Solution {
   Node root;
   static Stack<Integer> S;
   
   public static void main(String[] args) {
      Solution tree = new Solution();
      int n = 95;
      int sum = 0;
      String s = Integer.toBinaryString(n);
      System.out.println(s);
      //System.out.println(tree.getSize(n));
      
      S = new Stack<>();
      
      for(char x: s.toCharArray()) {
         S.add(x - '0');
      }
      
      tree.root = new Node(0);
      tree.createNode(tree.root, tree.getSize(s.length()));
      
      tree.DFS(tree.root, s);
      
      tree.printNode(tree.root);
      System.out.println();
      
      for(char y: s.toCharArray()) sum += (y - '0');
      
      if(tree.checkNode(tree.root) == sum) System.out.println("Possible");
      else System.out.println("Impossible");
   }
   
   private void DFS(Node root, String s) {
      if(root == null) return;
      else {      
         DFS(root.rt, s);
         if(S.size() > 0) root.data = S.pop();
         else root.data = 0;
         DFS(root.lt, s);
      }
   }
   
   private void printNode(Node root) {
      if(root == null) return;
      else {
         printNode(root.lt);
         System.out.print(root.data);
         printNode(root.rt);
      }
   }
   
   private void createNode(Node root, int h) {
      if(h==1) return;
      else {
         root.lt = new Node(0);
         root.rt = new Node(0);
         createNode(root.lt, h-1);
         createNode(root.rt, h-1);
      }
   }
   
   private int getSize(int n) {
      int sum = 1;
      int cnt = 0;
      
      while(n > sum) {
         sum *= 2;
         cnt++;
      }
      return cnt;
   }
   
   private int checkNode(Node root) {
      if(root == null || root.data == 0) return 0;
      else {
         return root.data + checkNode(root.lt) + checkNode(root.rt);
      }
   }
}

class Node {
   int data;
   Node lt, rt;
   
   Node(int value) {
      this.data = value;
   }
}
