import java.util.PriorityQueue;

public class P10 {

	public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<String>();
	
	pq.add("Black");
	pq.add("Red");
	pq.add("Green");
	pq.add("White");
	
	System.out.println("Original Priority Queue: "+pq);
	
	String[] arr=new String[pq.size()];
	
	System.out.println("Array containing all of the elements in the queue: "+pq.toString());

	}

}
//Test input:
//[Black, Red, Green, White] 
//
//
//Sample Output:Original Priority Queue: [Black, Red, Green, White] 
//Array containing all of the elements in the queue: [Black, Red, Green,
//White]