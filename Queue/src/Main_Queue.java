
public class Main_Queue {

	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		
		q.insert(10);
		q.insert(12);
		q.insert(30);
		q.insert(10);
		q.insert(100);
		q.remove();
		q.remove();
		
		
		
		while(!q.isEmpty()) {
			System.out.println(q.peekfornt());
			q.remove();
		}
		

	}

}
