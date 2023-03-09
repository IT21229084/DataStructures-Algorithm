package linkList;

public class LinkMain {

	public static void main(String[] args) {
		
           //Create Object from LinkList class
		LinkList NW = new LinkList();
		
		NW.InsertFirst(10);
		NW.InsertFirst(20);
		NW.InsertFirst(30);
		NW.Delete(20);
		//System.out.println(NW.Find(11));
		NW.DisplayLinkList();
		

	}

}
