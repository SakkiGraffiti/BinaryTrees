package dsTrees;


public class BinarySearchTree {

	private TreeNode root;
		
	public BinarySearchTree () {
		
		super();
	}
	
	public boolean isEmpty(){
		if(root == null) {
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public boolean isFull()	{
		TreeNode temp= new TreeNode();
		if(temp == null) {
			return true;
		}
		else
		{
			temp = null;
			return false;
		}
	}
	
	
	public boolean insert(int data) {
		if(isFull()) {
			System.out.println("Cannot add data");
			return false;
		}
		else {
				if(isEmpty()) {
					TreeNode temp = new TreeNode();
					temp.setData(data);
					root=temp;
					return true;
				}
				else {
					return insertRecursive(root,data);
					
				}
		}
		
	}
	
	
	protected boolean insertRecursive(TreeNode parent, int data) {
				
		if(data > parent.getData() ) { //change to <= which displays in ascending order and vice versa
			if(parent.getLeft() == null) {
				TreeNode temp = new TreeNode();
				temp.setData(data);
				parent.setLeft(temp);
			}
			else {
				return insertRecursive(parent.getLeft(),data);
			}
		}

		
		else {
			
			if(data <= parent.getData() ) { //change to > which displays in ascending order and vice versa
				if(parent.getRight() == null) {
					TreeNode temp = new TreeNode();
					temp.setData(data);
					parent.setRight(temp);
				}
				else {
					return insertRecursive(parent.getRight(),data);
				}
				
			}
			
		}
		return true;
	}
	
	
	public void display() {
		displayInOrder(root);
		
	}
	
	
	protected void displayInOrder(TreeNode parent) {
		
		if(parent != null) {
			displayInOrder(parent.getLeft());
			System.out.println(parent.getData());
			displayInOrder(parent.getRight());
		}
	}

}
