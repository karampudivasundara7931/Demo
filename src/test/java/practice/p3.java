package practice;

import java.util.LinkedList;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(1);
		ll.add(4);
		ll.add(3);

		System.out.println(ll);

		LinkedList<Integer> ll1 = new LinkedList<Integer>();

		ll.descendingIterator().forEachRemaining(ll1::add);

		System.out.println(ll1);
	}

}
