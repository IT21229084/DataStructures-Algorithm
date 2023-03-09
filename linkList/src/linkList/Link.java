package linkList;
// Implement Link class from java
public class Link {
	// Create Attributes
	public int iData;
	public Link Next;
	
	public Link(int iData) {
		
		this.iData = iData;
		Next = null;
	}
	//Display Link values
	public void DisplayLink() {
		System.out.println("Link Value: "+iData);
	}
	
	
	

}
