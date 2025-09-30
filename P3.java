import java.util.PriorityQueue;

public class P3 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Green");
		pq.add("Red");
		pq.add("Orange");
		
		System.out.println("Priority Queue1:"+pq);
		
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("Black");
		pq1.add("White");
		pq1.add("Pink");
		
		System.out.println();
		System.out.println("Priority Queue2:"+pq1);
		
		pq.addAll(pq1);
		
		System.out.println();
		System.out.println("New Priority : "+pq);

	}

}
//Test input:
//[Green, Red, Orange]
//
//[Black, White, Pink]
//
//New Priority Queue1: 
//Sample Output:Priority Queue1: [Green, Red, Orange]
//Priority Queue2: [Black, White, Pink]
//[Black, Green, Orange, Red, White, Pink]