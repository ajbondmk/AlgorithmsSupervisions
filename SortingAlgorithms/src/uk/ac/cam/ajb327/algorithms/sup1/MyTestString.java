package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.List;
import java.util.ArrayList;

public class MyTestString {

	public static void main (String[] args) {

		List<String> mList = new ArrayList<>();
		mList.add("fgvazdfbh");
		mList.add("dfbzf");
		mList.add("hnfxgz");
		mList.add("s");
		mList.add("dfgszfgt");

		BubbleSort<String> mBubbleSort = new BubbleSort<>();
		List<String> bubbleSorted = mBubbleSort.sort(mList);

		QuickSort<String> mQuickSort = new QuickSort<>();
		List<String> quickSorted = mQuickSort.sort(mList);

		MergeSort<String> mMergesort = new MergeSort<>();
		List<String> mergeSorted = mMergesort.sort(mList);

		InsertionSort<String> mInsertionSort = new InsertionSort<>();
		List<String> insertionSorted = mInsertionSort.sort(mList);

		System.out.println("Original list:");
		System.out.println(mList);
		System.out.println();

		System.out.println("Bubble sorted list:");
		System.out.println(bubbleSorted);
		System.out.println();

		System.out.println("Quick sorted list:");
		System.out.println(quickSorted);
		System.out.println();

		System.out.println("Merge sorted list:");
		System.out.println(mergeSorted);
		System.out.println();

		System.out.println("Insertion sorted list:");
		System.out.println(insertionSorted);
		System.out.println();


	}

}
