package uk.ac.cam.ajb327.algorithms.sup2.maxheap;

public class MaxHeap implements MaxHeapInterface {

	private int maxHeapSize = 127;

    private char[] heap = new char[0];

    public MaxHeap(String s) throws HeapSizeExceededException {
    	if (s.length() > maxHeapSize) throw new HeapSizeExceededException();
		s = s.toLowerCase();
		char[] sChar = s.toCharArray();
		for (char c : sChar) insert(c);
    }

    @Override
    public char getMax() throws EmptyHeapException {
        if (heap.length == 0) throw new EmptyHeapException();
        char max = heap[0];
        int index = heap.length - 1;
        char[] newHeap = new char[index];
        if (index == 0) {
            heap = newHeap;
            return max;
        }
        char btmRight = heap[index];
        newHeap[0] = btmRight;
        for (int x = 1; x < index; x++) newHeap[x] = heap[x];
        heap = newHeap;
        int node = 0;
        while (node < index) {
            if (2 * node + 1 >= index) {
                break;
            }
            int largestChild = 2 * node + 1;
            if (largestChild + 1 < index) {
                if (heap[largestChild + 1] > heap[largestChild]) largestChild += 1;
            }
            if (heap[node] < heap[largestChild]) {
                heap[node] = heap[largestChild];
                heap[largestChild] = btmRight;
            }
            node = largestChild;
        }
        return max;
    }

    @Override
    public void insert(char i) throws HeapSizeExceededException {
    	if (heap.length == maxHeapSize) throw new HeapSizeExceededException();
		i = Character.toLowerCase(i);
		int index = heap.length;
		char[] newHeap = new char[index + 1];
		for (int x = 0; x < index; x++) newHeap[x] = heap[x];
		heap = newHeap;
		heap[index] = i;
		int parentIndex = (index - 1) / 2;
		while (index != 0) {
			if (i <= heap[parentIndex]) return;
			heap[index] = heap[parentIndex];
			heap[parentIndex] = i;
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}
    }

}