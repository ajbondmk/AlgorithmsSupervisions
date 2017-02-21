package uk.ac.cam.ajb327.algorithms.sup3;

import java.util.ArrayList;
import java.util.List;

public class CircularList<T> {

	//for testing
	public static void main (String[] args) {
		CircularList<Character> test = new CircularList<>();
		test.head = test.initialise();
		System.out.println(test.findStartOfCircle());
	}

	//for testing
	public Node initialise () {
		Node<Character> E = new Node<>('E', null);
		Node<Character> D = new Node<>('D', E);
		Node<Character> C = new Node<>('C', D);
		E.next = C;
		Node<Character> B = new Node<>('B', C);
		Node<Character> A = new Node<>('A', B);
		return A;
	}

    private class Node<T> {
        T val;
        Node<T> next;

        public Node(T val, Node<T> next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node<T> head;

    /**
     * Circular list lists you build a linked list that is circular. That is,
     * by following pointers you go back to a previous element. Note that this
     * need not be the first element. Eg A-B-C-D-E-C-D-E.
     *
     * This method finds the element that is at the start of the circle. For
     * the above string it should return C.
     */
    public T findStartOfCircle() {
    	Node<T> current = head;
    	List<T> seen = new ArrayList<>();
    	while (true) {
    		seen.add(current.val);
    		if (seen.contains(current.next.val)) return current.next.val;
    		else current = current.next;
		}
    }

}