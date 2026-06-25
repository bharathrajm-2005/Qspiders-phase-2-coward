package collection_framework.Queue;

import java.util.*;

import collection_framework.Student;

public class FirstProgram {
	public static void main(String[] args) {
		PriorityQueue<Student>q = new PriorityQueue<>();
		q.offer(new Student(101, "Bharath Raj", 23));
		q.offer(new Student(102, "Bharath Raj", 23));
		q.offer(new Student(103, "Bharath Raj", 23));
		
		System.out.println(q);
		
	}
}
