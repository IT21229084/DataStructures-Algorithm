package linkList;

public class Link {
	
	public int iData;
	public Link Next;
	
	public Link(int iData) {
		
		this.iData = iData;
		Next = null;
	}
	
	public void DisplayLink() {
		System.out.println("Link Value: "+iData);
	}
	
	
	

}
