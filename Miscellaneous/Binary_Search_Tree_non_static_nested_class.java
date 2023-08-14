class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	Node insertNode(Node root, int value) {
		
		if (root == null) {
			root = new Node(value);
			return root;
		}
		
		if(root.data > value)
			root.left = insertNode(root.left, value);
		else 
			root.right = insertNode(root.right, value);
		
		return root;		
	}
	
	void inorder(Node root) {
		if(root == null)
			return;
		
		inorder(root.left);
	}
	
}


public class Binary_Search_Tree_non_static_nested_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
