package dsTrees;

public class TreeNode {
	
	private int data;
	private TreeNode left = null;
	private TreeNode right = null;
	
	public TreeNode() {
		super();
		
	}

	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public TreeNode(TreeNode tree) {
		super();
		this.data = tree.data;
		this.left = tree.left;
		this.right = tree.right;
	}
		

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
	public void display () {
		System.out.println(toString());
	}
	

}
