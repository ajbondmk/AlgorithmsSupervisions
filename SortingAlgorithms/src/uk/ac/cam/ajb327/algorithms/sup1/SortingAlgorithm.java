package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.List;

public interface SortingAlgorithm<T extends Comparable> {

   public List<T> sort(List<T> input);

}