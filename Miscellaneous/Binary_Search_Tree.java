
public class Binary_Search_Tree {

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public static Node insert(Node root, int val) {

		if (root == null) {
			root = new Node(val);
			return root;
		}

		if (root.data > val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}

		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
