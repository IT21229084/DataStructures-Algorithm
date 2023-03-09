package linkList;

public class LinkList {
	
	private Link First;

	public LinkList() {
		
		First = null;
	}
	
	public void DisplayLinkList() {
		
		Link Current = First;
		
		while(Current != null) {
			
			Current.DisplayLink();
			Current = Current.Next;
			
		}
		System.out.println(" \n");
	}
	
	public void InsertFirst(int Data) {
		
		Link newLink = new Link(Data);
		newLink.Next = First;
		First = newLink;
				
	}
	
	public Link DeleteFirst() {
		Link Temp = First;
		First = First.Next;	
		return Temp;
	}
	
	public Link Find(int value) {
		
		Link Current = First;
		
		while(Current != null) {
			
			if (Current.iData == value) {
				return Current;
			}
			Current = Current.Next;
			
		}
		return null;
	}
	
	public Link Delete(int data) {
		
		Link current = First;
		Link Previos = First;
		
		while(current.iData != data) {
			
			if(current.Next == null ) {
				return null;
			}
			Previos = current;
			current = current.Next;	
		}
		
		if(current == First) {
			First = First.Next;
		}else {
			Previos.Next = current.Next;
		}
		return current;
	}
	
	public boolean InsertAfter(int key,int Data) {
		
		Link current = First;
		
		while(current != null) {
			
			if (current.iData == key) {
				
				Link newLink = new Link(Data);
				newLink.Next = current.Next;
				current.Next = newLink;
				
				return true;
			}
			current = current.Next;
			
			
		}
		
		
		return false;
	}
}
