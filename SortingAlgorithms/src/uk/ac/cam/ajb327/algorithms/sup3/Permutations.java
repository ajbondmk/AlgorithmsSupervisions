package uk.ac.cam.ajb327.algorithms.sup3;

import uk.ac.cam.ajb327.algorithms.sup2.CharHeapSort;

import java.util.List;
import java.util.ArrayList;

public class Permutations {

	//for testing
	public static void main (String[] args) {
		String s1a = "abbsbafkfk";
		String s2a = "abbsbafkfk";
		String s1b = "rbfabkejb";
		String s2b = "lejgva";
		String s1c = "iarfhao";
		String s2c = "aerigbn";
		String s1d = "alsndf";
		String s2d = "";
		System.out.println(arePermuations(s1a, s2a));
		System.out.println(arePermuations(s1b, s2b));
		System.out.println(arePermuations(s1c, s2c));
		System.out.println(arePermuations(s1d, s2d));
	}

    /**
     * @return true if s1 is a permutation of s2
     */
    public static boolean arePermuations(String s1, String s2) {
    	if (s1.length() != s2.length()) return false;
        CharHeapSort sorter = new CharHeapSort();
        List<Character> s1Chars = new ArrayList<>();
        for (char ch : s1.toCharArray()) s1Chars.add(ch);
        List<Character> s1Sorted = sorter.sort(s1Chars);
        List<Character> s2Chars = new ArrayList<>();
        for (char ch : s2.toCharArray()) s2Chars.add(ch);
        List<Character> s2Sorted = sorter.sort(s2Chars);
        for (int i = 0; i < s1Sorted.size(); i++) {
        	if (s1Sorted.get(i) != s2Sorted.get(i)) return false;
		}
        return true;
    }
}