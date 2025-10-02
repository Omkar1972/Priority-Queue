import java.util.PriorityQueue;

public class P7 {

	public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<String>();
	
	pq.add("Black");
	pq.add("Red");
	pq.add("Green");
	pq.add("White");
	
	System.out.println("First Priority Queue: "+pq);
	
	PriorityQueue<String> pq1=new PriorityQueue<String>();
	
	pq1.add("Black");
	pq1.add("Orange");
	pq1.add("Pink");
	pq1.add("Red");
	
	System.out.println();
	System.out.println("Second Priority Queue: "+pq1);
	
	for(String cp:pq)
	{
		if(pq1.contains(cp))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	

	}

}
//[Black, Red, Green, White]
//
//[Black, Orange, Pink, Red] 
//
//
//Sample Output:First Priority Queue: [Black, Red, Green, White]
//Second Priority Queue: [Black, Orange, Pink, Red] 
//Yes
//Yes
//No
//No