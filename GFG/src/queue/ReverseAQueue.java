package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		reverse(queue);
		System.out.println(queue);
	}

	private static void reverse(Queue<Integer> queue) {
		if(queue.isEmpty())
			return;
		int x=queue.poll();
		reverse(queue);
		queue.add(x);
	}

}
