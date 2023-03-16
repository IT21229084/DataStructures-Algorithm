
public class Tree {

	public Node root;// 
	
	Tree(){
		root = null;
	}
	
	//Implement Find method
	public Node Find(int key) {
		
		Node Current = root;
		
		//Find the key value 
		while(!(Current.iData == key)) {
			
			if (key < Current.dData) {
				Current = Current.leftChild;
			}
			Current = Current.rightChild;
			
			if (Current == null) {
				return null;
			}
		}
		
		return Current;
	}
	
	//Implement Insert method to add new values
	public void Insert(int key, double Data) {
		
		Node newNode = new Node();
		newNode.iData = key;
		newNode.dData = Data;
		
		 if (root == null) {
			 
			 root = newNode;
		 }else {
			 Node Current = root;
			 Node parent  = root;
			 
			 
			 while(true) {
				 parent  = Current;
				 if (key < Current.iData) {
					 
					 Current = Current.leftChild;
					 
					 if (Current == null) {
						 
						 parent.leftChild = newNode;
						 return ;
					 } 
				 }else {
					 
					 Current = Current.rightChild;
					 
					 if(Current == null) {
						 parent.rightChild = newNode;
						 return;
					 }
				 }

			 }
		 }
	}
	
	
	// .......Implement Traversing Method.......
	private void inOrder(Node localRoot) {
		
		if (localRoot != null) {
			
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	
	private void postOrder(Node localRoot) {
		
		if (localRoot != null ) {
			
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	
	private void preOrder(Node localRoot) {
		
		localRoot.displayNode();
		preOrder(localRoot.leftChild);
		preOrder(localRoot.rightChild);	
	}
	
	
	//Find maximum values from tree
	public Node maximum() {
		
		Node Current = root;
		
		while(Current.rightChild != null) { //Until current value is null loop continue
			
			Current = Current.rightChild;	
		}
		
		return Current;
	}
	
	//Find minimum values from tree
    public Node minimum() {
		
		Node Current = root;
		
		while(Current.leftChild != null) {
			
			Current = Current.leftChild;	
		}
		
		return Current;
	}
	
	
	//Implement DescendingOrder method
	public void descendingOrder(Node localRoot) {
		
		if (localRoot == null) {
	        return;
	    }
		
		descendingOrder(localRoot.rightChild);
		localRoot.displayNode();
		descendingOrder(localRoot.leftChild);
		
	}
	
	//implement AscendingOrder method
	public void ascendingOrder(Node localRoot) {
		
		if (localRoot == null) {
	        return;
	    }
		ascendingOrder(localRoot.leftChild);
		localRoot.displayNode();
		ascendingOrder(localRoot.rightChild);
				
	}
	

}
