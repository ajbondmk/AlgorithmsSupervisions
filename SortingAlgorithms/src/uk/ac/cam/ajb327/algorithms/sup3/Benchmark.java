package uk.ac.cam.ajb327.algorithms.sup3;

import java.util.LinkedList;
import java.util.List;

public class Benchmark {

    public static void main(String[] args) {
        // Feel free to change the bounds if your computer can/can't cope.
        for (int i = 0; i < 6; i++) {
            System.out.println("Linked list 10^" + i + " items: " +
                    benchmarkList((int)Math.pow(10, i)));
            System.out.println("Array 10^" + i + " items: " +
                    benchmarkArray((int)Math.pow(10,i)));
        }
    }

    /**
     * Calculated the time taken to create a linked list with n items and then
     * read every value.
     * @param numItems the number of items to include in a linked list.
     * @return The time taken to create and walk a linked list
     */
    public static long benchmarkList(int numItems) {
    	long start = System.nanoTime();
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < numItems; i++) list.add(i);
		int thisItem;
		for (int j = 0; j < numItems; j++) thisItem = list.get(j);
		long end = System.nanoTime();
		return (end-start);
    }

    /**
     * Same for an array
     */
    public static long benchmarkArray(int numItems) {
		long start = System.nanoTime();
		Integer[] array = new Integer[numItems];
		for (int i = 0; i < numItems; i++) array[i] = i;
		int thisItem;
		for (int j = 0; j < numItems; j++) thisItem = array[j];
		long end = System.nanoTime();
		return (end-start);
    }

}