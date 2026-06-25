package collection_framework.Queue;
import java.util.*;
public class DequeSample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Deque<Integer>dq = new LinkedList<>();
//		dq.offer(10);
//		dq.offer(20);
//		dq.offer(30);
//		dq.poll();
		dq.push(10);
		dq.push(20);
		dq.push(30);
		dq.pop();
		System.out.println(dq);
		Queue<Integer>q = new LinkedList<>();
	}
}
