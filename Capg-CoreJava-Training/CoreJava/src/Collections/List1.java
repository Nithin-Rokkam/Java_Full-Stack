package Collections;

import java.util.*;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext()) {
			if(itr.next()%2==0) {
			itr.remove();
			}
			System.out.println(arr);
		}
	}

}
