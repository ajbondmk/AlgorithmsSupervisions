package uk.ac.cam.ajb327.algorithms.sup3;

public class StringCompression {

	//for testing
	public static void main (String[] args) {
		String original = "abbbccccd";
		String compressed = compress(original);
		String decompressed = decompress(compressed);
		System.out.println(original);
		System.out.println(compressed);
		System.out.println(decompressed);
	}

    public static String compress(String input) {
        char[] letters = input.toCharArray();
        String compressed = "";
        int count = 1;
        if (letters.length > 0) compressed += letters[0];
        for (int i = 1; i < letters.length; i++) {
            char letter = letters[i];
            if (compressed.charAt(compressed.length()-1) == letter) {
            	count++;
			}
			else {
            	if (count != 1) {
            		compressed += count;
            		count = 1;
				}
				compressed += letter;
			}
        }
        return compressed;
    }

    public static String decompress(String input) {
    	char[] chars = input.toCharArray();
    	String decompressed = "";
		if (chars.length > 0) decompressed += chars[0];
		for (int i = 1; i < chars.length; i++) {
			char character = chars[i];
			if (Character.isDigit(character)) {
				for (int j = Character.getNumericValue(character); j > 1; j--) {
					decompressed += chars[i-1];
				}
			}
			else decompressed += character;
		}
    	return decompressed;
    }

}