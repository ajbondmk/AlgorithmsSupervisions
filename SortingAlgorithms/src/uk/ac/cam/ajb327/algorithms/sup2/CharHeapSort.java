package uk.ac.cam.ajb327.algorithms.sup2;

import uk.ac.cam.ajb327.algorithms.sup1.SortingAlgorithm;
import uk.ac.cam.ajb327.algorithms.sup2.maxheap.MaxHeap;
import uk.ac.cam.ajb327.algorithms.sup2.maxheap.EmptyHeapException;
import uk.ac.cam.ajb327.algorithms.sup2.maxheap.HeapSizeExceededException;

import java.util.LinkedList;
import java.util.List;

public class CharHeapSort implements SortingAlgorithm<Character> {

	public List<Character> sort(List<Character> input) {
		List<Character> output = new LinkedList<>();
		try {
			MaxHeap heap = new MaxHeap(input.toString());
			for (int i = 0; i < input.size(); i++) {
				output.add(heap.getMax());
			}
			return output;
		}
		catch (HeapSizeExceededException e) {
			System.out.println("Input too long.");
		}
		catch (EmptyHeapException e) {
			System.out.println("Something went wrong... (EmptyHeapException)");
		}
		return null;
	}

}