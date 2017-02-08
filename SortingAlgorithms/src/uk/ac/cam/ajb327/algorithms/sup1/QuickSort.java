package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.ArrayList;
import java.util.List;

public class QuickSort<T extends Comparable> implements SortingAlgorithm<T> {

    public List<T> sort(List<T> input) {
		List<T> sorted = new ArrayList<>(input);
		return sortSublist(sorted);
    }

    private List<T> sortSublist(List<T> input) {
    	if (input.size() > 1) {
    		T pivot = input.get(0);
    		List<T> smaller = new ArrayList<>();
    		List<T> larger = new ArrayList<>();
    		for (T item : input.subList(1, input.size())) {
    			if (item.compareTo(pivot) < 0) smaller.add(item);
    			else larger.add(item);
			}
			input = sortSublist(smaller);
    		input.add(pivot);
    		input.addAll(sortSublist(larger));
		}
		return input;
	}

}