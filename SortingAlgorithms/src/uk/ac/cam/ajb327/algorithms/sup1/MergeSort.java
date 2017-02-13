package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable> implements SortingAlgorithm<T> {

    public List<T> sort(List<T> input) {
		List<T> sorted = new ArrayList<>(input);
		sorted = sortSublist(sorted);
		return sorted;
    }

    private List<T> sortSublist(List<T> input) {
    	int size = input.size();
		if (size > 1) {
			List<T> merged = new ArrayList<T>();
			int halfway = size / 2;
			List<T> sublist1 = sortSublist(input.subList(0, halfway));
			List<T> sublist2 = sortSublist(input.subList(halfway, size));
			int size1 = sublist1.size();
			int size2 = sublist2.size();
			int pointer1 = 0;
			int pointer2 = 0;
			while (pointer1 < size1 || pointer2 < size2) {
				if (pointer1 >= size1) {
					merged.add(sublist2.get(pointer2));
					pointer2++;
				}
				else if (pointer2 >= size2) {
					merged.add(sublist1.get(pointer1));
					pointer1++;
				}
				else {
					if (sublist1.get(pointer1).compareTo(sublist2.get(pointer2)) < 0) {
						merged.add(sublist1.get(pointer1));
						pointer1++;
					}
					else {
						merged.add(sublist2.get(pointer2));
						pointer2++;
					}
				}
			}
			input = merged;
		}
		return input;
    }

}