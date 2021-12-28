package day47_Collection_Part2;

import java.util.LinkedList;
import java.util.Queue;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class QueueExample {

	public static void main(String[] args) {

		Queue <String> q= new LinkedList<>();
		
		q.add("Mike");
		q.add("Ozzy");
		q.add("Jamal");
		q.add("Asiya");
		
		System.out.println(q.toString());
		
		String name= q.remove();
		System.out.println(name);
		
		System.out.println(q.toString());
		
		//removing an element from Queue using poll()
		// the poll() method is similar to remove() except that it returns null if the queue is empty
		
		
		name=q.poll();
		System.out.println(name);
		
		System.out.println(q.toString());
		
		// get the element at the front of the queue without removing it using peek()
		
		name= q.peek();
		System.out.println(name);
		System.out.println(q.toString());
		
		name=((LinkedList<String>) q).get(0);
		
		System.out.println(name);
		System.out.println(q.toString());
		
	}

}
