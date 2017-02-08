package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort<T extends Comparable> implements SortingAlgorithm<T> {

    public List<T> sort(List<T> input) {
		List<T> sorted = new ArrayList<>(input);
		for (int pos = 1; pos < sorted.size(); pos++) {
			T thisItem = sorted.get(pos);
			for (int pos2 = pos - 1; pos2 >= 0; pos2--) {
				if (thisItem.compareTo(sorted.get(pos2)) < 0) {
					sorted.set(pos2+1, sorted.get(pos2));
					sorted.set(pos2, thisItem);
				}
				else break;
			}
		}
		return sorted;
    }

}