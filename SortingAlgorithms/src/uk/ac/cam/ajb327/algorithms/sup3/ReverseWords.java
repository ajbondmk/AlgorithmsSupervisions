package uk.ac.cam.ajb327.algorithms.sup3;

public class ReverseWords {

	//for testing
	public static void main (String[] args) {
		String original = "Chelsea five Manchester Utd Nill";
		String reversed = reverseWords(original);
		System.out.println(original);
		System.out.println(reversed);
	}

    /**
     * @param input A string consisting of words separated with spaces. No
     *              punctuation. eg 'Chelsea five Manchester Utd Nill'
     * @return A string with the letters in each word reversed. eg 'aeslehC evif
     *  retsehcnaM dtU liN'
     */
    public static String reverseWords(String input) {
    	String reversedWords = "";
    	String tempWord = "";
        for (int i = 0; i < input.length(); i++) {
        	char character = input.charAt(i);
        	if (character == ' ') {
        		reversedWords += tempWord + " ";
        		tempWord = "";
			}
			else {
        		tempWord = character + tempWord;
			}
		}
		if (!tempWord.equals("")) reversedWords += tempWord;
        return reversedWords;
    }

}