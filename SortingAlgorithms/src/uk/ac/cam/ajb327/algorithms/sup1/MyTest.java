package uk.ac.cam.ajb327.algorithms.sup1;

import java.util.List;
import java.util.ArrayList;

public class MyTest {

	public static void main (String[] args) {

		List<Double> mList = new ArrayList<>();
		mList.add(5.6);
		mList.add(6.9);
		mList.add(3.4552);
		mList.add(1.352);
		mList.add(9.0);
		mList.add(3.838294);
		mList.add(6.3293);
		mList.add(7.234);
		mList.add(2.2);
		mList.add(1.75);

		BubbleSort<Double> mBubbleSort = new BubbleSort<>();
		List<Double> bubbleSorted = mBubbleSort.sort(mList);

		QuickSort<Double> mQuickSort = new QuickSort<>();
		List<Double> quickSorted = mQuickSort.sort(mList);

		MergeSort<Double> mMergesort = new MergeSort<>();
		List<Double> mergeSorted = mMergesort.sort(mList);

		InsertionSort<Double> mInsertionSort = new InsertionSort<>();
		List<Double> insertionSorted = mInsertionSort.sort(mList);

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
