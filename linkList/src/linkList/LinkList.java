package linkList;

//Implemets LinkList class from java
public class LinkList {
	
	private Link First;

	public LinkList() {
		
		First = null;
	}
	
     //Implement method to Display all the Linklist values
	public void DisplayLinkList() {
		
		Link Current = First;
		
		while(Current != null) {
			
			Current.DisplayLink();
			Current = Current.Next;
			
		}
		System.out.println(" \n");
	}
	
     //Implement InsertFirst method to add value at Beginning linklist.
	public void InsertFirst(int Data) {
		
		Link newLink = new Link(Data);
		newLink.Next = First;
		First = newLink;
				
	}
	
     //Implement DeleteFirst method to delete value at Beginning linklist.
	public Link DeleteFirst() {
		Link Temp = First;
		First = First.Next;	
		return Temp;
	}
	
      //Implement Find method to Find value from LinkList
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
	
      //Implement method delete values from LinkList
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
	
     //Implement method Insert values to LinkList
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
