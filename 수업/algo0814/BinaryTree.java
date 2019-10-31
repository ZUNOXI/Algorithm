package algo0814;

public class BinaryTree {
		private char[] tree;
		private int max_depth;
		public BinaryTree(int max_depth) {
			max_depth = max_depth;
			tree = new char[1<<max_depth];
		}
		
		public void preorder(int node) {
//			boolean [] visted = null ;
//			StringBuilder sb = new StringBuilder();
//			if(visted[node]) {
//				return;
//			}
			if(node>= tree.length || tree[node] =='\0') {
				return;
			}
//			visted[node] = true;
//			sb.append(node+" ");
			System.out.print(tree[node]+" ");
			preorder(node*2);
			preorder(node*2+1);
		}
		
		public void inoder(int node) {
			if(node>= tree.length || tree[node] =='\0') {
				return;
			}
//			visted[node] = true;
//			sb.append(node+" ");
			inoder(node*2);
			System.out.print(tree[node]+" ");
			inoder(node*2+1);
		}
		
		public void postorder(int node) {
			if(node>= tree.length || tree[node] =='\0') {
				return;
			}
//			visted[node] = true;
			postorder(node*2);
			postorder(node*2+1);
			System.out.print(tree[node]+" ");
			
		}
		
		public void setRoot(char data) {
			tree[1] = data;
		}
		public void setLeft(int parent, char data) {
			tree[parent * 2] = data;
		}
		public void setRight(int parent, char data) {
			tree[parent *2 + 1] = data;
		}
		public String toString() {
			String sb = "" ;
			for(char a : tree) {
				sb = sb+a;
			}
			return sb;
		}
		
		
		public static void main(String[] args) {
			BinaryTree tree = new BinaryTree(4);
//			tree.setRoot('A');
//			tree.setLeft(1, 'B');
//			tree.setRight(1, 'C');
//			tree.setLeft(2, 'D');
//			tree.setRight(2, 'E');
//			tree.setLeft(3, 'F');
//			tree.setRight(3, 'G');
//			tree.setLeft(4, 'H');
//			tree.setRight(4, 'I');
//			tree.setLeft(5, 'J');
//			tree.setRight(5, 'K');
//			tree.setLeft(6, 'L');
//			tree.setRight(6, 'M');
			System.out.println(tree.toString());
			
			tree.preorder(1);
			System.out.println();
			tree.inoder(1);
			System.out.println();
			tree.postorder(1);
			
			
		}
	}