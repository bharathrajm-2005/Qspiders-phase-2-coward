package collection_framework.linked_list;
import java.util.LinkedList;

public class FirstProgram {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.addFirst(0);
		list.addLast(70);
		
		System.out.println(list);
		System.out.println(list.getFirst());
		
	}
}
