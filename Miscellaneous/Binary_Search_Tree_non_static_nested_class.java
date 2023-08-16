class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	// A method can return any type of data, including class types.
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
		
		System.out.println(root.data + " ");
		
		inorder(root.right);
	}
	
}


public class Binary_Search_Tree_non_static_nested_class {

	public static void main(String[] args) {
		
		int value[] = {3, 4, 6, 2, 7, 9, 5, 8};
		
		Node rootNode = null;
		
		for (int i = 0; i < value.length; i++) {
			rootNode = 
		}
	}

}
