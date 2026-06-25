package collection_framework.linked_list;

import java.util.*;

public class ArrayListPrograms {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(10);
		a.add(30);
		a.add(50);
		a.add(70);
		a.add(90);
		b.add(20);
		b.add(40);
		b.add(60);
		b.add(80);
		b.add(100);
//		ArrayList<Integer> c = mergeTwoArrayLists(a, b);
//		System.out.println(c);
//		rotateArrayListKTimes(c, 3);
//		System.out.println(c);
		ArrayList<Integer> d = new ArrayList<>();
		d.add(10);
		d.add(null);
		d.add(20);
		d.add(null);
		d.add(null);
		d.add(30);
		d.add(40);
		d.add(50);
		removeAllNull(d);
		System.out.println(d);
		
	}
	
	public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> a,ArrayList<Integer> b){
		
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0 ; 
		int j = 0 ;
		while(i<a.size()&&j<b.size()) {
			if(a.get(i)<=b.get(j)) {
				res.add(a.get(i));
				i++;
			}
			else {
				res.add(b.get(j));
				j++;
			}
		}
		
		while(i<a.size()) {
			res.add(a.get(i));
			i++;
		}
		while(j<b.size()) {
			res.add(b.get(j));
			j++;
		}
		return res;
		
	}
	
	public static void rotateArrayListKTimes(ArrayList<Integer> arr, int k) {

	    int n = arr.size();

	    k = k % n;

	    reverse(arr, 0, n - 1);

	    reverse(arr, 0, k - 1);

	    reverse(arr, k, n - 1);
	}

	public static void reverse(ArrayList<Integer> arr, int start, int end) {

	    while (start < end) {

	        int temp = arr.get(start);

	        arr.set(start, arr.get(end));

	        arr.set(end, temp);

	        start++;
	        end--;
	    }
	}

	public static void removeAllNull(ArrayList<Integer> arr) {
		for(int i = 0 ; i < arr.size() ; i++) {
			if(arr.get(i)==null) {
				arr.remove(i);
				i--;
			}
		}
	}
}