package uk.ac.cam.ajb327.algorithms.sup2.maxheap;

public interface MaxHeapInterface {
    // get the maximum value (or exception if empty)
    public char getMax() throws EmptyHeapException;
    // insert a new value into the heap (or exception if full)
    public void insert(char i) throws HeapSizeExceededException;
}