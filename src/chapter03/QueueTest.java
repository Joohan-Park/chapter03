package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		while(!(q.isEmpty())){
			String s = q.poll();
			System.out.println(s);
		}

		q.offer("고길동");
		q.offer("희동이");
		q.offer("도우넛");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
	}

}
