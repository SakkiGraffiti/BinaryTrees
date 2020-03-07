package dsTrees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree ();
		
		for(int i = 9; i > 0; i--) {
			tree.insert(i);
			
		}
		tree.display();
	}

}
