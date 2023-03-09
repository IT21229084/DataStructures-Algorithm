
public class Main_Stack {

	public static void main(String[] args) {
		
		Stack st = new Stack(5);
		
		//Add the values to the Stack
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		
        //Display the values in Stack
		while(!st.isEmpty()) {    
			System.out.println(st.pop());
			System.out.print("");
		}
	}

}
