
public class treeMain {

	public static void main(String[] args) {
		
		Tree t  = new Tree();// Create tree object
		
		//Insert values into the Tree
		t.Insert(10, 12.5);
		t.Insert(20, 10.0);
		t.Insert(5,  30.23);
		t.Insert(7,  15.43);
		t.Insert(2,  19.0);
		t.Insert(15, 50.5);
		t.Insert(30, 40.2);
		
		//Create an object and assign method
     	Node v = t.minimum(); //assign minimum values in the tree
		Node v2 = t.maximum();//assign minimum values in the tree
		
		//Display values
		v.displayNode();
		v2.displayNode();
		
		// Display Asc and Desc Values
		t.descendingOrder(t.root);
		t.ascendingOrder(t.root);
		
		

		
	}
	private Node findRecursive(Node localRoot, int empno) {
    	 
    	 if(localRoot == null) {
    		 return null;
  	 }
  	     else if(localRoot.empNo ==empno) {
  		 System.out.println(localRoot.empName);
          		 return localRoot;
    	 }
  	     else if (empno <localRoot.empNo) {
  	    	 return findRecursive(localRoot.leftChild,empno);
  	     }else {
  	    	return findRecursive(localRoot.rightChild,empno);
  	    	 
  	     }
    	 
     }
	 public void deleteAll() {
    	 root = null;
     }
	 public void traversepreorder() {
		 preOrder(root);
	}

}
