package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable> implements SortingAlgorithm<T> {

	public List<T> sort(List<T> input) {
		List<T> sorted = new ArrayList<>(input);
		T temp;
		for (int end = sorted.size() - 1; end > 0; end--) {
			for (int pos = 0; pos < end; pos++) {
				T thisItem = sorted.get(pos);
				T nextItem = sorted.get(pos+1);
				if (thisItem.compareTo(nextItem) > 0) {
					temp = thisItem;
					sorted.set(pos, nextItem);
					sorted.set(pos+1, temp);
				}
			}
		}
		return sorted;
	}

}