package Collections;
import java.util.*;
public class ListRefExample {
	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<Integer> l1=new LinkedList<>();
		List<Integer> l2=new ArrayList<>();
		l1.add(1);
		l1.add(1, 2);
		l1.addFirst(3);
		l1.addLast(4);
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1.contains(3));
		System.out.println(l1);
		//l1.clear();
		
		l2.add(12);
		l2.add(1, 13);
		l2.addFirst(10);
		System.out.println(l2);
		l2.addLast(14);
		l2.add(1, 11);
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		System.out.println(l2.contains(3));
		
	}
}
